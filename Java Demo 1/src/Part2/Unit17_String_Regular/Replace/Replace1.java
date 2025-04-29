package Part2.Unit17_String_Regular.Replace;
public class Replace1 {
    public static void main(String[] args) {
        String str="fooAfooABfooABCfoo";
        System.out.println("原始字串:" + str + '\n');
        
        String[] regexs = {".foo", ".?foo", ".*foo", ".+foo", "(A|B|C)foo"};
        for(String regex : regexs) 
        {
            System.out.println(str.replaceAll(regex, "Orz"));           
        }
    }
}



/*
 *  ^  : 開始由首字字元
 *  $  : 結束在最末個字元
 *
 *  .  : 任意字元
 *  \d : 0~9
 *  \D : 非0~9
 *  \s : \t,\n,\f,\r,\x0B
 *  \S : 非\t,\n,\f,\r,\x0B
 *  \w : a~z,A~Z,0~9
 *  \W : 非a~z,A~Z,0~9
 *  \b : 空白
 *
 *  x?     : x出現0~1次 (先採用1個,再用0個)
 *  x*     : x出現0~n次 (先採用n個,再次用n-1個,...)
 *  x+     : x出現1~n次
 *  x{n}   : x出現n次
 *  x{n,m} : x出現n~m次
 *  [0-9]  : 0~9
 *  [^0-9] : 非0~9 
 *  [A-Z]  : A~Z
 *  [^A-Z] : 非A~Z
 *  (A|B|C)  : A或B或C
 */
 