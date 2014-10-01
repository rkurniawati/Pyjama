public class myTest {

    static int[] a;

    public static void main(String[] args) {
        int result = 0;
        int[] a = parallel_ordered(4);
    }

    public static int[] parallel_ordered(int threadNumber) {
        int[] array = new int[threadNumber];
        int[] counter = new int[1];
        counter[0] = 0;
        //#omp parallel reduction(frr:a) 
        {
            //#omp for reduction(frr:a) schedule(dynamic,1) 
            for (int _OMP_VANCY_ITERATOR_ = 0; _OMP_VANCY_ITERATOR_ < 3; ++_OMP_VANCY_ITERATOR_) switch(_OMP_VANCY_ITERATOR_) {
                case 0:
                    System.out.println("dfdddddddddd");
                    break;
                case 1:
                    {
                        System.out.println("dfd");
                    }
                    break;
                case 2:
                    {
                        System.out.println("dfd");
                        System.out.println("dfd");
                    }
                    break;
                default:
                    break;
            }
        }
        //#omp for private(d) nowait 
        for (int _OMP_VANCY_ITERATOR_ = 0; _OMP_VANCY_ITERATOR_ < 1; ++_OMP_VANCY_ITERATOR_) {
            System.out.println("dfd");
        }
        System.out.println("dfd");
        return array;
    }
}
