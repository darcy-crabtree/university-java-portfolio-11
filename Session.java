package Practical_11;


public class Session {
    int id;
    String location;
    Talk[] talkArray = new Talk[4];

    // Making variables usable
    public Session(int id, String location) {
        this.id = id;
        this.location = location;
    }

    //Makes variables readable
    @Override
    public String toString() {
        return "{Session " + id +
                ": currentSize = '" + talkArray.length + '\'' +
                ", id = '" + id + '\'' +
                ", location = " + location + "\'" + "\n" +
                //builtArray(sortedArray, 5) +
                builtArray(talkArray, 5) +
                "}\n";
    }

    //Allows talks to be scheduled
    public void scheduleTalk(Talk talk) {
        for (int i = 0; i< talkArray.length; i++) {
            if (talkArray[i] == null){
                talkArray[i]= talk;
                break;
            }
        }
    }

    //Allows talks to be removed
    public void cancelTalk(int talkIdToCancel) {
        for (int i = 0; i < talkArray.length; i++) {
            Talk currentTalk = talkArray[i];
            if (talkIdToCancel == currentTalk.id) {
                talkArray[i] = null;
                break;
            }
        }
    }

    //Sorting
    /*
    //Taken from Unit_11_Auxillary_src_files by Ilias Tachmazidis accessed 07/01/2024
    //Modified to suit the requirements of this portfolio project.

    public static Talk[] insertionSort(Talk[] array) {
        for (int sorted = 0; // only the first element is sorted
             sorted < talkArray.length - 1; // stop when the whole list is sorted
             sorted++) { // one new element sorted each time round

            Talk newElement = array[sorted + 1]; // first unsorted element

            int compareTo = sorted; // start by comparing last sorted
            while (compareTo >= 0 && // move until the start of sorted list
                    newElement.compareTo(array[compareTo]) < 0) {

                // move gap to the left
                array[compareTo + 1] = array[compareTo];
                compareTo--;
            }
            // put unsorted element into gap
            array[compareTo + 1] = newElement;
        }
        return array;
    }
     */

    //Puts all the talks into an array to be printed out.
    //Taken from Unit_11_Auxillary_src_files by Ilias Tachmazidis accessed 07/01/2024
    //Modified to suit the requirements of this portfolio project.

    public static <T> String builtArray(T[] array, int maxShow) {
        if (array == null) return "null";
        if (array.length == 0) return "[]";
        StringBuilder builder = new StringBuilder("[" + array[0]);
        int index = 1;
        while (index < maxShow && index < array.length) {
            builder.append("," + array[index++]);
        }
        if (array.length <= maxShow) {
            builder.append("]");
        } else {
            builder.append(",...]");
        }
        return builder.toString();
    }
}