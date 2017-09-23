/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningnewword;

/**
 *
 * @author TUANDASE62310
 */
public class Word {
    private String ja, eng, vi;

    public Word() {
    }

    public Word(String ja, String eng, String vi) {
        this.ja = ja;
        this.eng = eng;
        this.vi = vi;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }
    
}
