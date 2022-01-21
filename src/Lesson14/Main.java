package Lesson14;


import Lesson14.Model.HeavyBox;
import Lesson14.Service.BoxService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        BoxService boxService = new BoxService();
        List<HeavyBox> pack = new ArrayList();


        pack.add(boxService.createBox(5, 5));
        pack.add(boxService.createBox(8, 10));
        pack.add(boxService.createBox(2, 3));
        pack.add(boxService.createBox(5, 7));

        boxService.display(pack);

        pack.set(0, boxService.createBox(5, 2));
        boxService.display(pack);

        pack.remove(pack.size()-1);

        HeavyBox[] array = pack.toArray(new HeavyBox[0]);
        boxService.displayArray(Arrays.asList(array));

        HeavyBox[] array1 = new HeavyBox[pack.size()];
        pack.toArray(array1);
        boxService.displayArray(Arrays.asList(array1));

        HeavyBox[] array2 = pack.stream().toArray(HeavyBox[]::new);
        boxService.displayArray(Arrays.asList(array2));
        pack.removeAll(pack);

        boxService.display(pack);
    }
}
