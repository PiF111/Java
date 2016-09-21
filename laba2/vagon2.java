/**
 * Created by andre on 20.09.2016.
 */
public class vagon2 extends vagon {

    public void IzmenitxChisloMest(int NovoeChisloMest){
        ChisloMest = NovoeChisloMest;
    }

    @Override
    public void ZanyatxMesto(int NomerMesta) {
        if (Mesta[NomerMesta-1]==1) System.out.println("Это место уже занято:" + NomerMesta + "(Вагон № " + NomerEtogoVagona + ")" );
        super.ZanyatxMesto(NomerMesta);
    }

    @Override
    public void VagonInfo() {
        System.out.println("Вагон № " + NomerEtogoVagona);
        int a=0;
        for (int i=0;i<ChisloMest;i++)
            if (Mesta[i]==0) a++;
        System.out.println("Число свободных мест " + a );
        super.VagonInfo();
    }
}
