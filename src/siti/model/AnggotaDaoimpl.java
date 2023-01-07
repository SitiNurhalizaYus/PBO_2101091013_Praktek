/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siti.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author siti nurhaliza yus
 */
public class AnggotaDaoimpl implements AnggotaDao {

    private List<Anggota> data = new ArrayList<>();
    
    public AnggotaDaoimpl(){
        data.add(new Anggota("2101091013", "siti", "Padang"));
        data.add(new Anggota("2101091014", "sarah", "Solok"));
        data.add(new Anggota("2101091015", "ayu", "Bukittinggi"));
    }
    
    @Override
    public Anggota save(Anggota anggota) {
        data.add(anggota);
        return anggota;
    }

    @Override
    public Anggota update(int index, Anggota anggota) {
        data.set(index, anggota);
        return anggota;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public Anggota getAnggota(int index) {
        return data.get(index);
    }

    @Override
    public List<Anggota> getAllAnggota() {
        return data;
    }
       
    
}
