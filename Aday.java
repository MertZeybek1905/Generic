public abstract class Aday {
    private int Matematik;
    private int Turkce;
    private int Fizik;
    private int Kimya;
    private int Biyoloji;
    private String isim;
    public Aday(int matematik,int turkce,int fizik,int kimya,int biyoloji,String isim){
        this.Matematik=matematik;
        this.Turkce=turkce;
        this.Fizik=fizik;
        this.Kimya=kimya;
        this.Biyoloji=biyoloji;
        this.isim=isim;
    }
    public int getMatematik(){
        return this.Matematik;
    }
    public void setMatematik(int mat){
        this.Matematik=mat;
    }
    public int getTurkce(){
        return this.Turkce;
    }
    public void setTurkce(int turkce){
        this.Turkce=turkce;
    }
    public int getFizik(){
        return this.Fizik;
    }
    public void setFizik(int fizik){
        this.Fizik=fizik;
    }
    public int getKimya(){
        return this.Kimya;
    }
    public void setKimya(int kimya){
        this.Kimya=kimya;
    }
    public int getBiyoloji(){
        return this.Biyoloji;
    }
    public void setBiyoloji(int bio){
        this.Biyoloji=bio;
    }
    public String getİsim(){
        return this.isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    abstract int puanhesapla();
}
