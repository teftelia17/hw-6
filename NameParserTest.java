class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        if (isArrNull(names)) {
            for (String name : names) {
                String firstName = name.split(" ")[0];

                result.append(firstName);
                result.append(", ");

            }
        }
        if (!(isOneCharLen(result.toString()))) {
            result = result.deleteCharAt(result.length()-1).deleteCharAt(result.length()-1);

        } else {
            result = new StringBuilder("");
        }

        return result.toString();
    }

    public boolean isOneCharLen(String str) {
        boolean isNullOrOne = false;

        if (str.length() <= 1) {
            isNullOrOne = true;
        }

        return isNullOrOne;
    }

    public boolean isArrNull(String[] strArr) {
        boolean isOne = false;

        for (String str : strArr) {
            if (str.length() != 0) {
                isOne = true;
            }
        }

        return isOne;
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"Ytxizoxi Tymela","Deyf Hogezu","Nupuxyxok Uhezzih","Qecahe Roxy","Nelikyevna Zuditiica"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}