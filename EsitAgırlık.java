public class EsitAgırlık extends Aday {

    public EsitAgırlık(int matematik, int turkce, int fizik, int kimya, int biyoloji, String isim) {
        super(matematik, turkce, fizik, kimya, biyoloji, isim);
        //TODO Auto-generated constructor stub
    }

    @Override
    int puanhesapla() {
        return getMatematik()*5 + getTurkce()*5 + getBiyoloji()*2 +getFizik()*3 +getKimya()*3;
    }
    
}
