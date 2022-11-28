package lesson_10.homework.misc;

import java.util.ArrayList;

public class ArrayListExt<String> extends ArrayList<String> {
    public int orderlengthcheck() {
        if (this.size() > 0) {
            for (int i = 0; i < this.size() - 1; i++) {
                if (this.get(i).toString().length() > this.get(i+1).toString().length()) {
                    return i+1;
                }
            }
        }
        return -1;
    }
}

