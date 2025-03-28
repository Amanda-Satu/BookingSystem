package za.ac.cput.repository;
//Sinhle Xiluva Mthethwa
//221802797

import za.ac.cput.domain.Painter;

import java.util.List;

public interface IPainterRepository extends IRepository<Painter, String>{
    List<Painter> getAll();


}
