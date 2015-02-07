public class HammingDistance {
  public static void main( String[] args ) {
    String s1 = "TTATCACTAAGCTCACATCGCCCTGCCGCGACATTCAAGTAGCCTCGCATTACTTACCTATCGACGCGTTTGATTATGGAATCTTCGTTCAGCGATCAATTCGTTTCCGTATTTCATTCGAGAGTATAACCGCTGAGCGCGATGACCGGGGCAAAGGACCAGCCTCCCTCATGTATAGATACGGGACTACGGAGGGTCGGCATGAACGATGTGATGCGACTTGTACAGCGGTGCCATCCATATCTATTGAATTTAGCGGCCAGAGACAGATATCTTGTTCCTCGTAAGGCTGAATATCATCGACGACGCAAACTATCGAGGAAGCCTGAAATCATGTACGATTGAGTGGGAACAACGAAGTGCCCCGTGTGAGCTTAAGACGAGTGCGGGGTTAAACCTATTCGGGACCTGGAATTGGTCGCAACGATTCCAACCTATATAAGGCGGATAGAGTATGCTGGTGAAAGATCCATGTGCAAACTGTTTACAGCAGAGTGCAGCACCGCGCGAGAGCTGGTGTAGGCGACAACACGCGCTTACCAGAATCGCACTGCAACCCAGCTAGTGCTTCCTTCCAGGACCTATGAATCATAGTAATGAAAGAGTCTCAGTAACATTCACGCATTGACATGTGTTGATAGCTATGGACGTCGGTGACTTTGTTAGATCTCTCGCTGGTTCGGAGCGCGTCCTATCTGTGAAGTCATTCGCGCCACCTCACGCGTTCCATGAGTTCTCCGCAACCCGGCTCGGTCGTTCCACGATAACTTTAGTGGAAAACATATCTCCAGGCACTTTGGGGTCTGCTTGAATGGGACCTGTTATAAAGACCGCCAGCCTGAACCCTGGAGGTCCCCTACCAGTATAGTAACATGGAGCGAGCTGTCGGGTGAGTTCCAGTATTCTCGGACAAACGGGCATCCGTGTAGGGGTGTTATCTGACGCGAAGCGGCCCACTGACAAGCGCCCATTTTTCAAGCTGCAAAGCCCAGGCCTT";
    String s2 = "TAAACACCAGGATCACTTAGCGATGACGCGAACTGCTTTTAGCTTAGGCTTTTTCACCCACAGATGCTTAGGCGCTTGGGGCCTACTTCCCGCACTTCAAGAAGCCTTTTATATACAGCGGGAGTTTAACGGGTTGCTTACATGCGGTGTGAATTTCACCGGCCTCGGTCGGCCAATGATTATTGACTAAGAAGGGTCGGTATGAACTAGGTGATGAGTCGGTTAGGGCGATGCCATCCACATATTTATGATGTCTTTGCTTTAACCCGGAATTAGGTTCCGGGTAGGCCCGGTATTTACATACGGCGCAGATATTCGAAGAAGACCGCAACTATCTACGTATCACTGTACACTACCAAGTCGCCCGGGGCGGCCGAGAATGTAATCGCGGTACTTGCCGTAACGGAAAGGAAATTGGACCCACGAATACCCACTTGTAAAGGGCTTGAATCATAAGCAACTGAAAAACTGATAATCAGAGTAGTCGGTACAGAGGTTGTAGCAGGGATAGGTAAGGCCGAACGTGAGTCACCCGCTTTCCACATAATTCCTGAAACACAGTAACGAATCATTTCGAGAGCCTCTCAATCATAATATGGAAATACTCGTGATAAGAGTCGCGTAATCCTGGGTTTCGCTTGGGTCCGGTCGTGGACGGATAGTTAACATGGCCGGCGACCGGGTCCCGGTTCCATACATCCTGTAATCGGGCCAAGCTGACACGATCCAGGGGCGAATTCCTGTCCTCCCCGCCGGTGCTTCGGTAAATACGGTGCAATAGACGTTACCAGGCAATGCGGCGACGGCACGTGGTTGTGCGTGTATCGAGATTGCAGCTTCAGACCTTGGGTGTGCCGTATTTGTTGAGTGCCATCGGGGGTGAGGTCGGGTGGTTAACGGGATTATGGGTCGAAGGTGGATCTATATAATTGCATCAGCCGAAGCGAGTCGCTGCGACGACGGGTAATCAGTTTTCAGACGGCTTCCTCGAGAGTAT";
    System.out.println(hamming(s1,s2));
  }
  
  public static int hamming( String a, String b ) {
    int count = 0;
    for(int i = 0; i < a.length(); ++i) {
      if(a.charAt(i) != b.charAt(i)) {
        ++count;
      }
    }
    return count;
  }
}