package lotto.auto;

import lotto.domain.Rank;
import lotto.domain.Record;

import java.io.PrintStream;

public class SecondStateView {
    public void printQuestion(PrintStream out) {
        out.println("지난 주 당첨 번호를 입력해 주세요.");
    }

    public void printResult(PrintStream out, Record record) {
        out.println("당첨 통계");
        out.println("---------");
        for (Rank rank : Rank.values()) {
            out.printf("%d개 일치 (%s원)- %d개%n", rank.getMatchedCount(), rank.getWinningMoney(), rank.getCount(record));
        }
        out.printf("총 수익률은 %.2f입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)", record.getProfitRate());
    }
}
