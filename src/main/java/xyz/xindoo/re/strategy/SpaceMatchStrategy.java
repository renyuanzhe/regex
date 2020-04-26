package xyz.xindoo.re.strategy;

public class SpaceMatchStrategy implements MatchStrategy{
    private boolean isReverse;
    public SpaceMatchStrategy(boolean isReverse) {
        this.isReverse = isReverse;
    }
    @Override
    public boolean isMatch(char c) {
        boolean res = c == '\f' || c == '\n' || c == '\r' || c == '\t';
        if (isReverse) {
            return !res;
        }
        return res;
    }
}
