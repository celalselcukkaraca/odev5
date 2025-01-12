import com.rd.Muhasebe;
import com.rd.Personel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MuhasebeTest {

    @Test
    public void testMaasHesapla_NormalGun() {
        Personel personel = new Personel(20);
        Muhasebe muhasebe = new Muhasebe();
        int beklenenMaas = 20 * 500;
        Assert.assertEquals(muhasebe.maasHesapla(personel), beklenenMaas);
    }

    @Test
    public void testMaasHesapla_PrimliGun() {
        Personel personel = new Personel(30);
        Muhasebe muhasebe = new Muhasebe();
        int beklenenMaas = (25 * 500) + (5 * 1000);
        Assert.assertEquals(muhasebe.maasHesapla(personel), beklenenMaas);
    }
}