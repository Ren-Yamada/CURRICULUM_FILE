package curriculum_29;

import java.util.Comparator;

// 都道府県を比較するためのComparatorクラス
public class PrefectureComparator implements Comparator<Prefecture> {
    private boolean ascendingOrder; // 昇順かどうかを示すフラグ

    // コンストラクター
    public PrefectureComparator(boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder; // 昇順フラグを設定
    }

    // 比較メソッド
    @Override
    public int compare(Prefecture p1, Prefecture p2) {
        if (ascendingOrder) { // 昇順の場合
            return Integer.compare(p1.getId(), p2.getId()); // IDを比較
        } else { // 降順の場合
            return Integer.compare(p2.getId(), p1.getId()); // IDを逆順に比較
        }
    }
}
