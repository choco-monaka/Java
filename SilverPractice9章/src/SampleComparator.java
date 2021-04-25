import java.util.Comparator;

public class SampleComparator implements Comparator<Sample> {

  @Override
  public int compare(Sample s1, Sample s2) {
    if (s1.getId() < s2.getId()) {
      return 1; // 第2引数の順番を前にするなら1
    }

    if (s2.getId() < s1.getId()) {
      return -1; // 第1引数の順番を前にするなら-1
    }
    return 0; //// 第1 第2引数が同列で並び替えをしないなら0
  }

}
