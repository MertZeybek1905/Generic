public class Sayısal extends Aday {

    public Sayısal(int matematik, int turkce, int fizik, int kimya, int biyoloji, String isim) {
        super(matematik, turkce, fizik, kimya, biyoloji, isim);
       
    }

    @Override
    int puanhesapla() {
        return getMatematik()*5 + getFizik()*4 + getBiyoloji()*3 +getKimya()*4 +getTurkce()*3;
    }
    
}
