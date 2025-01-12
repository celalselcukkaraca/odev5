import com.rd.Muhasebe;
import com.rd.Personel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MuhasebeTest_Dataprovider {

    @DataProvider(name = "maasVerileri")
    public Object[][] maasVerileri() {
        return new Object[][] {
                { 20, 20 * 500 },
                { 25, 25 * 500 },
                { 30, (25 * 500) + (5 * 1000) }
        };
    }

    @Test(dataProvider = "maasVerileri")
    public void testMaasHesapla(int calismaGun, int beklenenMaas) {
        Personel personel = new Personel(calismaGun);
        Muhasebe muhasebe = new Muhasebe();
        Assert.assertEquals(muhasebe.maasHesapla(personel), beklenenMaas);
    }
}