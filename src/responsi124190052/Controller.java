/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi124190052;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Controller {
    
    ModelResponsi modelresponsi;
    ViewResponsi viewresponsi;

    public Controller(ViewResponsi vr, ModelResponsi mr) {
        this.modelresponsi = mr;
        this.viewresponsi = vr;
        
        if (modelresponsi.getBanyakData() != 0) {
        