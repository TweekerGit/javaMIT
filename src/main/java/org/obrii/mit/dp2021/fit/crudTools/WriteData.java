package org.obrii.mit.dp2021.fit.crudTools;

import org.obrii.mit.dp2021.fit.data.Data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteData {
    public static void write(List<Data> data){
        try (FileOutputStream f = new FileOutputStream(Crud._file); ObjectOutputStream o = new ObjectOutputStream(f)) {

            data.forEach(d -> {
                try {
                    o.writeObject(d);
                } catch (IOException ex) {
                    Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
