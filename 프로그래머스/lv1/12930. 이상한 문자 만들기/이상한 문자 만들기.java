class Solution {
    public String solution(String s) {
        String[] texts = s.split(" ",-1);
        StringBuilder sb = new StringBuilder();

        for (int v = 0; v < texts.length; v++)
        {
            char[] lines = texts[v].toCharArray();

            for (int i = 0; i < lines.length; i++)
            {
                if (i % 2 == 0)
                {
                    lines[i] = String.valueOf(lines[i]).toUpperCase().charAt(0);
                }else
                {
                    lines[i] = String.valueOf(lines[i]).toLowerCase().charAt(0);
                }
            }

            sb.append(lines);
            if (v != texts.length -1)
                sb.append(" ");
        }
        return sb.toString();
    }
}