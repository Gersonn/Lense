package cl.ckelar.android.lense.dto;

import android.content.Context;

/**
 * Created by gedi on 26-04-17.
 */

public class AlfabetoSenias {

    private String nombre;
    private String imgAssets;

    public AlfabetoSenias(String nombre, String imgAssets) {
        this.nombre = nombre;
        this.imgAssets = imgAssets;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImgAssets() {
        return imgAssets;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static AlfabetoSenias[] ITEMS = {
            new AlfabetoSenias("", "alfabeto/a.png"),
            new AlfabetoSenias("", "alfabeto/b.png"),
            new AlfabetoSenias("", "alfabeto/c.png"),
            new AlfabetoSenias("", "alfabeto/d.png"),
            new AlfabetoSenias("", "alfabeto/e.png"),
            new AlfabetoSenias("", "alfabeto/f.png"),
            new AlfabetoSenias("", "alfabeto/g.png"),
            new AlfabetoSenias("", "alfabeto/h.png"),
            new AlfabetoSenias("", "alfabeto/i.png"),
            new AlfabetoSenias("", "alfabeto/j.png"),
            new AlfabetoSenias("", "alfabeto/k.png"),
            new AlfabetoSenias("", "alfabeto/l.png"),
            new AlfabetoSenias("", "alfabeto/m.png"),
            new AlfabetoSenias("", "alfabeto/n.png"),
            new AlfabetoSenias("", "alfabeto/enie.png"),
            new AlfabetoSenias("", "alfabeto/o.png"),
            new AlfabetoSenias("", "alfabeto/p.png"),
            new AlfabetoSenias("", "alfabeto/q.png"),
            new AlfabetoSenias("", "alfabeto/r.png"),
            new AlfabetoSenias("", "alfabeto/s.png"),
            new AlfabetoSenias("", "alfabeto/t.png"),
            new AlfabetoSenias("", "alfabeto/u.png"),
            new AlfabetoSenias("", "alfabeto/v.png"),
            new AlfabetoSenias("", "alfabeto/w.png"),
            new AlfabetoSenias("", "alfabeto/x.png"),
            new AlfabetoSenias("", "alfabeto/y.png"),
            new AlfabetoSenias("", "alfabeto/z.png")
    };


    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return AlfabetoSenias
     */
    public static AlfabetoSenias getItem(int id) {
        for (AlfabetoSenias item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

}
