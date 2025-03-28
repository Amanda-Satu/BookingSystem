package za.ac.cput.repository;
//Sinhle Xiluva Mthethwa
//221802797

import za.ac.cput.domain.Painter;

import java.util.ArrayList;

import java.util.List;

public class PainterRepository implements IPainterRepository {

    private static PainterRepository repository = null;
    private List<Painter> painterList;

    private PainterRepository() {
        painterList = new ArrayList<Painter>();
    }

    public static PainterRepository getRepository() {
        if (repository == null) {
            repository = new PainterRepository();
        }
        return repository;
    }

    @Override
    public List<Painter> getAll() {
        return painterList;
    }

    @Override
    public Painter create(Painter painter) {
        boolean success = painterList.add(painter);
        if(success){
            return painter;
        }
        return null;
    }



    @Override
    public Painter read(String id) {
        for(Painter painter : painterList){
            if(painter.getPainterID().equals(id)){
                return painter;
            }
        }
        return null;
    }



    @Override
    public Painter update(Painter painter) {
        Painter painterOld = read(painter.getPainterID());
        if(painterOld != null){
            painterList.remove(painterOld);
            painterList.add(painter);
            return painter;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Painter painter = read(id);
        if(painter != null){
            painterList.remove(painter);
            return true;
        }
        return false;
    }
}