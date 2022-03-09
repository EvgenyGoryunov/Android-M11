import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Donor donor1 = new Donor("ИвановИИ", "firts", true);
        Donor donor2 = new Donor("ПетровПП", "firts", true);
        Donor donor3 = new Donor("СидоровИИ", "second", false);
        Donor donor4 = new Donor("СергеевСС", "fourth", false);
        Donor donor5 = new Donor("ПутинВВ", "firts", true);
        Donor donor6 = new Donor("ОбамаОО", "firts", true);
        Donor donor7 = new Donor("ЖванецкииИИ", "second", false);
        Donor donor8 = new Donor("ПупкинНН", "firts", false);
        Donor donor9 = new Donor("СамсунгСС", "third", true);
        Donor donor10 = new Donor("НокияНН", "second", true);

        List<Donor> donorList = new ArrayList<>();
        donorList.add(donor1);
        donorList.add(donor2);
        donorList.add(donor3);
        donorList.add(donor4);
        donorList.add(donor5);
        donorList.add(donor6);
        donorList.add(donor7);
        donorList.add(donor8);
        donorList.add(donor9);
        donorList.add(donor10);

        Iterator<Donor> iterator = donorList.iterator();

        while (iterator.hasNext()) {
            Donor donor = iterator.next();
            if (!donor.isInTomsk()) {
                iterator.remove();
            }
        }

        for (Donor donor : donorList) {
            System.out.println(donor);
        }
    }
}
