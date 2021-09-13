public class VaccumCleaner {

    public boolean vaccumReturnsToStart(String moves) {
        int UD = 0;
        int LR = 0;

        for (int i = 0; i < moves.length(); i++) {
            char current = moves.charAt(i);
            if (current == 'U') {
                UD++;
            } else if (current == 'D') {
                UD--;
            } else if (current == 'L') {
                LR++;
            } else if (current == 'R') {
                LR--;
            }
        }
        return UD == 0 && LR == 0;
    }

}
