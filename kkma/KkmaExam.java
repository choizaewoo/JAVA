package java123;
import java.util.List;

import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;
import org.snu.ids.kkma.ma.MExpression;
import org.snu.ids.kkma.ma.MorphemeAnalyzer;
import org.snu.ids.kkma.ma.Sentence;
import org.snu.ids.kkma.util.Timer;
public class KkmaExam {
      public static void main(String[] args)
      {
            maTest();
            // string to extract keywords
            String strToExtrtKwrd = "이것도분석하는게가능한부분인가요오지고지리고돌리고인정?어인정";
            // init KeywordExtractor
            KeywordExtractor ke = new KeywordExtractor();
            // extract keywords
            KeywordList kl = ke.extractKeyword(strToExtrtKwrd, true);
            // print result
            for( int i = 0; i < kl.size(); i++ ) {
                  Keyword kwrd = kl.get(i);
                  System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
            }
      }
      public static void maTest()
      {
            String string = "이것도분석하는게가능한부분인가요오지고지리고돌리고인정?어인정";
            try {
                  MorphemeAnalyzer ma = new MorphemeAnalyzer();
                  ma.createLogger(null);
                  Timer timer = new Timer();
                  timer.start();
                  List<MExpression> ret = ma.analyze(string);
                  timer.stop();
                  timer.printMsg("Time");
                  ret = ma.postProcess(ret);
                  ret = ma.leaveJustBest(ret);
                  List<Sentence> stl = ma.divideToSentences(ret);
                  for( int i = 0; i < stl.size(); i++ ) {
                        Sentence st = stl.get(i);
                        System.out.println("=============================================  " + st.getSentence());
                        for( int j = 0; j < st.size(); j++ ) {
                              System.out.println(st.get(j));
                        }
                        
                  }
                  ma.closeLogger();
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }
}
