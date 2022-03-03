/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keyboard.utils;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author mattiapalano
 */
public class Note {
    
    private final Map<String, String> pitch_class = new HashMap<String, String>(){{
        put("C", "0");
        put("Db", "1");
        put("D", "2");
        put("Eb", "3");
        put("E", "4");
        put("F", "5");
        put("Gb", "6");
        put("G", "7");
        put("Ab", "8");
        put("A", "9");
        put("Bb", "10");
        put("B", "11");
    }};
    
    private final Map<String, String> name_class = new HashMap<String, String>() {{
        //Continua con tutte le altre note
        put("C", "0");
        put("C#", "0");
        put("Cx", "0");
        put("Cx#", "0");
        put("Db", "1");
        put("D", "1");
        put("Eb", "2");
        put("E", "2");
        put("F", "3");
        put("Gb", "4");
        put("G", "4");
        put("Ab", "5");
        put("A", "5");
        put("Bb", "6");
        put("B", "6");
    }};
    
    private enum durata{
       INTERO, META, QUARTO, SEDICESIMO, TRENTADUESIMO, SESSANTAQUATTRESIMO;
    }
    
    private enum ottava{
       ZERO, UNO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO;
    }
    
    String[][] br_notes = {
            {"C", "C#", "Cx", "Cx#", "Cxx", "Cxx#", "Cxxx", "Cbbbbb", "Cbbbb", "Cbbb", "Cbb", "Cb"},
            {"Dbb", "Db", "D", "D#", "Dx", "Dx#", "Dxx", "Dxx#", "Dxxx", "Dbbbbb", "Dbbbb", "Dbbb"},
            {"Ebbbb", "Ebbb", "Ebb", "Eb", "E", "E#", "Ex", "Ex#", "Exx", "Exx#", "Exxx", "Ebbbbb"},
            {"Fbbbbb", "Fbbbb", "Fbbb", "Fbb", "Fb", "F", "F#", "Fx", "Fx#", "Fxx", "Fxx#", "Fxxx"},
            {"Gxx#", "Gxxx", "Gbbbbb", "Gbbbb", "Gbbb", "Gbb", "Gb", "G", "G#", "Gx", "Gx#", "Gxx"},
            {"Ax#", "Axx", "Axx#", "Axxx", "Abbbbb", "Abbbb", "Abbb", "Abb", "Ab", "A", "A#", "Ax"},
            {"B#", "Bx", "Bx#", "Bxx", "Bxx#", "Bxxx", "Bbbbbb", "Bbbbb", "Bbbb", "Bbb", "Bb", "B"}
        };
    
    private final durata dur;
    
    private final ottava oct;
    
    private int pc, cpc, br, nc; //pitch class, name class, binomial repr 
    
    //Costruttore per il pianoforte, setto pitch class e name class
    public Note(String note, int duration, int ott) {
        dur = durata.values()[duration];    //Qui tramite indicizzazione
        oct = ottava.values()[ott];
        pc = Integer.parseInt(pitch_class.get(note));
        nc = Integer.parseInt(name_class.get(note));
        
    }
    
    public int getpitchClass(){
        return pc;
    }
    
    public int getnameClass(){
        return nc;
    }
    
    public int getCpc(){
        return (int)(oct.ordinal() * 12) + pc;
    }
    
}
