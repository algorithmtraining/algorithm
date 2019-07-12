package string;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReorderLogFiles_zane_0703 {


    public static void main(String[] args) {
        ReorderLogFiles_zane_0703 reorderLogFiles_zane_0703 = new ReorderLogFiles_zane_0703();
        String[] record = {
                "a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"
        };
        String[] array = reorderLogFiles_zane_0703.reorderLogFiles(record);
        for (String a : array) {
            System.out.println(a);
        }
    }
    /**
     * No.937
     * 解题思路：
     * 新建一个Log内部类并实现compareable接口，有标识符和日志内容两个属性，重写compareTo方法
     * 根据每个字符串的最后一个字符来判断该字符串是否是字母日志还是数字日志
     * 将字母日志和数字日志分开存放。
     * 对字母日志进行排序。
     * 将排序后的字母日志和数字日志进行合并。
     * 将list转为字符串数组返回。
     * @param logs
     * @return
     */
    public String[] reorderLogFiles(String[] logs) {

        List<Log> alist = new ArrayList<>();
        List<String> numList = new ArrayList<>();


        for (String log : logs) {
            int length = log.length();

            if (log.charAt(length - 1) >= 'a' && log.charAt(length - 1) <= 'z') {
                int index = log.indexOf(' ');
                Log alog = new Log();
                alog.setFlag(log.substring(0,index));
                alog.setTail(log.substring(index, log.length()));
                alist.add(alog);
            }else {
                numList.add(log);
            }
        }
        Collections.sort(alist);
        for (int i = alist.size() - 1; i >= 0; i--) {
            Log log = alist.get(i);
            String astring = log.getFlag() + log.getTail();
            numList.add(0, astring);
        }

        return (String[]) numList.toArray(new String[numList.size()]);
    }


    class Log implements Comparable {
        private String flag;
        private String tail;

        public Log() {
        }

        public Log(String flag, String tail) {
            this.flag = flag;
            this.tail = tail;
        }


        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getTail() {
            return tail;
        }

        public void setTail(String tail) {
            this.tail = tail;
        }

        /**
         * Compares this object with the specified object for order.  Returns a
         * negative integer, zero, or a positive integer as this object is less
         * than, equal to, or greater than the specified object.
         *
         * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
         * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
         * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
         * <tt>y.compareTo(x)</tt> throws an exception.)
         *
         * <p>The implementor must also ensure that the relation is transitive:
         * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
         * <tt>x.compareTo(z)&gt;0</tt>.
         *
         * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
         * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
         * all <tt>z</tt>.
         *
         * <p>It is strongly recommended, but <i>not</i> strictly required that
         * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
         * class that implements the <tt>Comparable</tt> interface and violates
         * this condition should clearly indicate this fact.  The recommended
         * language is "Note: this class has a natural ordering that is
         * inconsistent with equals."
         *
         * <p>In the foregoing description, the notation
         * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
         * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
         * <tt>0</tt>, or <tt>1</tt> according to whether the value of
         * <i>expression</i> is negative, zero or positive.
         *
         * @param o the object to be compared.
         * @return a negative integer, zero, or a positive integer as this object
         * is less than, equal to, or greater than the specified object.
         * @throws NullPointerException if the specified object is null
         * @throws ClassCastException   if the specified object's type prevents it
         *                              from being compared to this object.
         */
        @Override
        public int compareTo(Object o) {
            Log temp = (Log) o;
            if (this.tail.equals(temp.getTail())) {
                return this.flag.compareTo(temp.getFlag());
            }else {

                return this.tail.compareTo(temp.getTail());
            }
        }


        @Override
        public String toString() {
            return "Log{" +
                    "flag='" + flag + '\'' +
                    ", tail='" + tail + '\'' +
                    '}';
        }
    }

}
