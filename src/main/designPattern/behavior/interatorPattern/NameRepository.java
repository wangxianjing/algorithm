package main.designPattern.behavior.interatorPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class NameRepository implements Container {
    private String[] names = new String[]{"wang", "li", "han", "zhao", "guo"};

    @Override
    public Iterator getIterator() {
        return new NameItrator();
    }

    public class NameItrator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }

}
