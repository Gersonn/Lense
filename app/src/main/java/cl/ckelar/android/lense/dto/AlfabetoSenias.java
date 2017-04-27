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
            new AlfabetoSenias("a", "alfabeto/a.png"),
            new AlfabetoSenias("b", "alfabeto/b.png"),
            new AlfabetoSenias("c", "alfabeto/c.png"),
            new AlfabetoSenias("d", "alfabeto/d.png"),
            new AlfabetoSenias("e", "alfabeto/e.png"),
            new AlfabetoSenias("f", "alfabeto/f.png"),
            new AlfabetoSenias("g", "alfabeto/g.png"),
            new AlfabetoSenias("h", "alfabeto/h.png"),
            new AlfabetoSenias("i", "alfabeto/i.png"),
            new AlfabetoSenias("j", "alfabeto/j.png"),
            new AlfabetoSenias("k", "alfabeto/k.png"),
            new AlfabetoSenias("l", "alfabeto/l.png"),
            new AlfabetoSenias("m", "alfabeto/m.png"),
            new AlfabetoSenias("n", "alfabeto/n.png"),
            new AlfabetoSenias("enie", "alfabeto/enie.png"),
            new AlfabetoSenias("o", "alfabeto/o.png"),
            new AlfabetoSenias("p", "alfabeto/p.png"),
            new AlfabetoSenias("q", "alfabeto/q.png"),
            new AlfabetoSenias("r", "alfabeto/r.png"),
            new AlfabetoSenias("s", "alfabeto/s.png"),
            new AlfabetoSenias("t", "alfabeto/t.png"),
            new AlfabetoSenias("u", "alfabeto/u.png"),
            new AlfabetoSenias("v", "alfabeto/v.png"),
            new AlfabetoSenias("w", "alfabeto/w.png"),
            new AlfabetoSenias("x", "alfabeto/x.png"),
            new AlfabetoSenias("y", "alfabeto/y.png"),
            new AlfabetoSenias("z", "alfabeto/z.png")
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
