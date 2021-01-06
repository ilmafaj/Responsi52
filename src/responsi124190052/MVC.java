/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi124190052;

/**
 *
 * @author ILMA
 */
public class MVC {
    ModelResponsi mr = new ModelResponsi();
    Controller cont = new Controller(mr, vr,fd, dash, fa, ft, fe);
    Dashboard dash = new Dashboard();
    FormAbout fa = new FormAbout();
    FormEdit fe = new FormEdit();
    FormDaftar fd = new FormDaftar();
    FormLogin fl = new FormLogin();
    FormPinjam fp = new FormPinjam();
    
    
}
