package bai71;

public class quanLyTrangTrai {
    public class dongVat {
        public boolean khaNangDiBo() {
            return true;
        }
        public boolean khaNangDiBoi() {
            return true;
        }
    }
    public class lon extends dongVat {
        public boolean khaNangDiBo() {
            return true;
        }
        public boolean khaNangDiBoi() {
            return false;
        }
    }
    public class vit extends dongVat {
        public boolean khaNangDiBo() {
            return true;
        }
        public boolean khaNangDiBoi() {
            return true;
        }
    }

    public class ca extends dongVat {
        public boolean khaNangDiBo() {
            return false;
        }
        public boolean khaNangDiBoi() {
            return true;
        }
    }

    static public void main (String [] args) {
        quanLyTrangTrai qltt = new quanLyTrangTrai();
        dongVat dv = qltt.new dongVat();
        lon l = qltt.new lon();
        vit v = qltt.new vit();
        ca c = qltt.new ca();
        System.out.println("lon co kha nang di bo: " + l.khaNangDiBo());
        System.out.println("lon co kha nang di boi: " + l.khaNangDiBoi());
        System.out.println("vit co kha nang di bo: " + v.khaNangDiBo());
        System.out.println("vit co kha nang di boi: " + v.khaNangDiBoi());
        System.out.println("ca co kha nang di bo: " + c.khaNangDiBo());
        System.out.println("ca co kha nang di boi: " + c.khaNangDiBoi());
    }
}
