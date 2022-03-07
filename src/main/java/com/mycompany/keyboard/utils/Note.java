/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keyboard.utils;

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
/**
 *
 * @author mattiapalano
 */
public class Note {
    
    String[][] br_notes = {
            {"C", "C#", "Cx", "Cx#", "Cxx", "Cxx#", "Cxxx", "Cbbbbb", "Cbbbb", "Cbbb", "Cbb", "Cb"},
            {"Dbb", "Db", "D", "D#", "Dx", "Dx#", "Dxx", "Dxx#", "Dxxx", "Dbbbbb", "Dbbbb", "Dbbb"},
            {"Ebbbb", "Ebbb", "Ebb", "Eb", "E", "E#", "Ex", "Ex#", "Exx", "Exx#", "Exxx", "Ebbbbb"},
            {"Fbbbbb", "Fbbbb", "Fbbb", "Fbb", "Fb", "F", "F#", "Fx", "Fx#", "Fxx", "Fxx#", "Fxxx"},
            {"Gxx#", "Gxxx", "Gbbbbb", "Gbbbb", "Gbbb", "Gbb", "Gb", "G", "G#", "Gx", "Gx#", "Gxx"},
            {"Ax#", "Axx", "Axx#", "Axxx", "Abbbbb", "Abbbb", "Abbb", "Abb", "Ab", "A", "A#", "Ax"},
            {"B#", "Bx", "Bx#", "Bxx", "Bxx#", "Bxxx", "Bbbbbb", "Bbbbb", "Bbbb", "Bbb", "Bb", "B"}
        };
    
    private final Map<String, String> pitch_class = new HashMap<String, String>(){{
        put("C", "0");
        put("C#", "1");
        put("Cx", "2");
        put("Cx#", "3");
        put("Cxx", "4");
        put("Cxx#", "5");
        put("Cxxx", "6");
        put("Cbbbbb", "7");
        put("Cbbbb", "8");
        put("Cbbb", "9");
        put("Cbb", "10");
        put("Cb", "11");
        put("Dbb", "0");
        put("Db", "1");
        put("D", "2");
        put("D#", "3");
        put("Dx", "4");
        put("Dx#", "5");
        put("Dxx", "6");
        put("Dxx#", "7");
        put("Dxxx", "8");
        put("Dbbbbb", "9");
        put("Dbbbb", "10");
        put("Dbbb", "11");
        put("E", "4");
        put("E#", "5");
        put("Ex", "6");
        put("Ex#", "7");
        put("Exx", "8");
        put("Exx#", "9");
        put("Exxx", "10");
        put("Ebbbbb", "11");
        put("Ebbbb", "0");
        put("Ebbb", "1");
        put("Ebb", "2");
        put("Eb", "3");
        put("F", "5");
        put("F#", "6");
        put("Fx", "7");
        put("Fx#", "8");
        put("Fxx", "9");
        put("Fxx#", "10");
        put("Fxxx", "11");
        put("Fbbbbb", "0");
        put("Fbbbb", "1");
        put("Fbbb", "2");
        put("Fbb", "3");
        put("Fb", "4");
        put("G", "7");
        put("G#", "8");
        put("Gx", "9");
        put("Gx#", "10");
        put("Gxx", "11");
        put("Gxx#", "0");
        put("Gxxx", "1");
        put("Gbbbbb", "2");
        put("Gbbbb", "3");
        put("Gbbb", "4");
        put("Gbb", "5");
        put("Gb", "6");
        put("A", "9");
        put("A#", "10");
        put("Ax", "11");
        put("Ax#", "0");
        put("Axx", "1");
        put("Axx#", "2");
        put("Axxx", "3");
        put("Abbbbb", "4");
        put("Abbbb", "5");
        put("Abbb", "6");
        put("Abb", "7");
        put("Ab", "8");
        put("B", "11");
        put("B#", "0");
        put("Bx", "1");
        put("Bx#", "2");
        put("Bxx", "3");
        put("Bxx#", "4");
        put("Bxxx", "5");
        put("Bbbbbb", "6");
        put("Bbbbb", "7");
        put("Bbbb", "8");
        put("Bbb", "9");
        put("Bb", "10");
    }};
    
    private final Map<String, String> name_class = new HashMap<String, String>() {{
        //Continua con tutte le altre note
        put("C", "0");
        put("C#", "0");
        put("Cx", "0");
        put("Cx#", "0");
        put("Cxx", "0");
        put("Cxx#", "0");
        put("Cxxx", "0");
        put("Cbbbbb", "0");
        put("Cbbbb", "0");
        put("Cbbb", "0");
        put("Cbb", "0");
        put("Cb", "0");
        put("Dbb", "1");
        put("Db", "1");
        put("D", "1");
        put("D#", "1");
        put("Dx", "1");
        put("Dx#", "1");
        put("Dxx", "1");
        put("Dxx#", "1");
        put("Dxxx", "1");
        put("Dbbbbb", "1");
        put("Dbbbb", "1");
        put("Dbbb", "1");
        put("E", "2");
        put("E#", "2");
        put("Ex", "2");
        put("Ex#", "2");
        put("Exx", "2");
        put("Exx#", "2");
        put("Exxx", "2");
        put("Ebbbbb", "2");
        put("Ebbbb", "2");
        put("Ebbb", "2");
        put("Ebb", "2");
        put("Eb", "2");
        put("F", "3");
        put("F#", "3");
        put("Fx", "3");
        put("Fx#", "3");
        put("Fxx", "3");
        put("Fxx#", "3");
        put("Fxxx", "3");
        put("Fbbbbb", "3");
        put("Fbbbb", "3");
        put("Fbbb", "3");
        put("Fbb", "3");
        put("Fb", "3");
        put("G", "4");
        put("G#", "4");
        put("Gx", "4");
        put("Gx#", "4");
        put("Gxx", "4");
        put("Gxx#", "4");
        put("Gxxx", "4");
        put("Gbbbbb", "4");
        put("Gbbbb", "4");
        put("Gbbb", "4");
        put("Gbb", "4");
        put("Gb", "4");
        put("A", "5");
        put("A#", "5");
        put("Ax", "5");
        put("Ax#", "5");
        put("Axx", "5");
        put("Axx#", "5");
        put("Axxx", "5");
        put("Abbbbb", "5");
        put("Abbbb", "5");
        put("Abbb", "5");
        put("Abb", "5");
        put("Ab", "5");
        put("B", "6");
        put("B#", "6");
        put("Bx", "6");
        put("Bx#", "6");
        put("Bxx", "6");
        put("Bxx#", "6");
        put("Bxxx", "6");
        put("Bbbbbb", "6");
        put("Bbbbb", "6");
        put("Bbbb", "6");
        put("Bbb", "6");
        put("Bb", "6");
    }};
    
    private enum durata{
       INTERO, META, QUARTO, OTTAVO, SEDICESIMO, TRENTADUESIMO, SESSANTAQUATTRESIMO;
    }
    
    private enum ottava{
       ZERO, UNO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO;
    }
    
    
    //C'è effettivamente qualcosa di final?
    
    private durata dur;
    
    private ottava oct;
    
    private int pc, nc; //pitch class, name class 
    
    private int cpc, br;
    
     private String note_str;
    
    //Costruttore per il pianoforte, setto pitch class e name class
    //Devo cambiare da int a String?
    public Note(String note, int duration, int ott) {
        dur = durata.values()[duration];    //Qui tramite indicizzazione
        oct = ottava.values()[ott];
        pc = Integer.parseInt(pitch_class.get(note));
        nc = Integer.parseInt(name_class.get(note));
        note_str = note;
    }
    
    //Costruttore Nota Vuota
    public Note(){
        pc = -1;
        dur = durata.INTERO;
        oct = ottava.CINQUE;
        note_str = "";
        nc = -1;
    }
        
    //Getters
    
    public int getpitchClass(){
        return pc;
    }
    
    public int getnameClass(){
        return nc;
    }
    
    public int getCpc(){
        return (int)(oct.ordinal() * 12) + pc;
    }
    
    public int getOct(){
        return this.oct.ordinal();
    }
    
    public int getDur(){
        return (int) Math.pow(2, dur.ordinal());
    }
    
    public String getNote(){
        return note_str;
    }
    
    public String getNoteBr(int nc, int pc){
        return br_notes[nc][pc];
    }
    
    // Controlli booleani
    public boolean isNotaVuota(){
        return pc == -1 && dur == durata.INTERO && oct == ottava.CINQUE && note_str.equals("") && nc == -1;
    }
    
    //Prendo un dict a caso tanto ci sono tutte
    public boolean isNoteValid(String nota){
        return pitch_class.containsKey(nota);
    }
    
    public boolean isPcValid(String pc){
        return pitch_class.containsValue(pc);
    }
    
    public boolean isNcValid(String nc){
        return name_class.containsValue(nc);
    }
    
    //Setters
    public void setDur(String dur){
        try{
        switch (dur.substring(2)){
            case "1":
                this.dur = durata.INTERO;
                break;
            case "2":
                this.dur = durata.META;
                break;
            case "4":
                this.dur = durata.QUARTO;
                break;
            case "8":
                this.dur = durata.OTTAVO;
                break;
            case "16":
                this.dur = durata.SEDICESIMO;
                break;
            case "32":
                this.dur = durata.TRENTADUESIMO;
                break;
            case "64":
                this.dur = durata.SESSANTAQUATTRESIMO;
                break;
        }
        System.out.println(this.dur.ordinal());
        }
        catch(Exception e){
        
        }
    }
    
    public void setNcNote(String nota){
        if(isNoteValid(nota))
            nc = Integer.parseInt(name_class.get(nota));
    }
    
    public void setPcNote(String nota){
        if(isNoteValid(nota))
            pc = Integer.parseInt(pitch_class.get(nota));
    }
    
    public void setNote(String nota){
        if(isNoteValid(nota)){
            setPcNote(nota);
            setNcNote(nota);
            note_str = nota;
        }
    }
    
    public void setPc(String pc){
        if(isPcValid(pc)){
            this.pc = Integer.parseInt(pc);
        }
    }
    
    public void setOct(int ott){
        try{
            this.oct = ottava.values()[ott];
        }
        catch(Exception e){
        
        }
    }
    
    public void setNc(String nc){
        if(isNcValid(nc)){
            this.nc = Integer.parseInt(nc);
        }
    }
    
    public void setNoteBr(int nc, int pc){
        this.note_str = br_notes[nc][pc];
    }
    
}
