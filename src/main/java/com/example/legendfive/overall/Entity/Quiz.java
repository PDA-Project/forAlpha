package com.example.legendfive.overall.Entity;

import lombok.*;

@Getter
public enum Quiz {
    QUIZ_1("주식 시장에서 주식의 가격은 수요와 공급에 의해 결정된다.", true,
            "맞습니다. 주식 시장에서 주식의 가격은 주식을 사고 팔려는 투자자들의 수요와 공급에 따라 변동됩니다.",
            10),

    QUIZ_2("배당이란 기업이 낸 이익 중에서 주주에게 나눠주는 일종의 이자이다.",
            true,
            "맞습니다. 배당은 기업의 이익 중에서 주주에게 주당 배당금의 형태로 나눠지는 것입니다.",
            10),

    QUIZ_3("주식투자에서 '다이버시피케이션'은 여러 종목에 투자하여 투자 위험을 분산시키는 전략이다.",
            true,
            "맞습니다. 포트폴리오를 다양한 종목으로 구성하여 투자 위험을 분산시키는 것이 중요합니다.",
            10),

    QUIZ_4("P/E 비율이 높은 주식은 대체로 저평가된 주식이라고 볼 수 있다.",
            false,
            "아닙니다. P/E 비율이 높다는 것은 주가가 순이익에 비해 상대적으로 높다는 의미이므로, 저평가된 주식이라고 볼 수는 없습니다.",
            10),

    QUIZ_5("'블루 칩 주식'은 대체로 안정적이고 신뢰할 수 있는 대기업의 주식을 가리킨다.",
            true,
            "맞습니다. 블루 칩 주식은 대기업이며 안정적이고 신뢰할 수 있는 투자 대상입니다.",
            10),

    QUIZ_6("주식 시장에서 '풋 옵션'은 주식 가격이 상승할 것을 기대하는 투자자에게 유리하다.",
            false,
            "아닙니다. 풋 옵션은 주식 가격이 하락할 것을 예상하는 투자자에게 유리한 옵션입니다.",
            10),

    QUIZ_7("'테크니컬 분석'은 기업의 재무상태와 실적을 분석하여 주식을 평가하는 방법이다.",
            false,
            "아닙니다. 테크니컬 분석은 주가의 흐름과 거래량 등의 통계 자료를 활용하여 주식을 평가하는 방법입니다.",
            10),

    QUIZ_8("주식 시장에서 '불확실성'이 증가하면 일반적으로 주식 가격이 상승한다.",
            false,
            "아닙니다. 불확실성이 증가하면 오히려 주식 시장이 불안정해져 가격이 하락할 수 있습니다.",
            10),

    QUIZ_9("'채권'은 기업에게 자금을 대여하고 그 대가로 이자를 받는 증권이다.",
            true,
            "맞습니다. 채권은 기업이나 정부 등이 자금을 빌리고 그에 대한 이자를 지급하는 증권입니다.",
            10),

    QUIZ_10("주식 투자에서 '롱 포지션'은 주식을 매수하고 가격 상승을 기대하는 포지션을 가리킨다.",
            true,
            "정답입니다. 롱 포지션은 주식을 매수하여 가격 상승을 기대하는 투자 포지션을 의미합니다.",
            10),

    QUIZ_11("'마진 콜'은 주식 투자자가 자금 부족으로 인해 추가 자금을 조달하는 경우를 말한다.",
            false,
            "아닙니다. 마진 콜은 주식 가격 하락으로 인해 증권사가 투자자에게 추가 자금을 요구하는 경우를 말합니다.",
            10),

    QUIZ_12("주식 투자에서 '디버레지에이션'은 레버리지를 높이고 위험을 감소시키는 전략을 의미한다.",
            false,
            "아닙니다. 디버레지에이션은 리스크를 감소시키기 위해 레버리지를 줄이는 전략을 나타냅니다.",
            10),

    QUIZ_13("'미국 연준'은 미국의 중앙은행으로, 통화량을 조절하고 경제를 안정시키는 역할을 한다.",
            true,
            "맞습니다. 미국 연준은 미국의 중앙은행으로, 통화 정책을 수립하고 경제를 안정시키는 역할을 합니다.",
            10),

    QUIZ_14("'주가 수익비율(P/E ratio)'은 주식 시장에서 어떤 기업이 가치 있는 투자 대상인지를 판단하는 데 사용된다.",
            true,
            "맞습니다. P/E 비율은 기업의 주가를 이익으로 나눈 비율로, 투자 가치를 판단하는 데 활용됩니다.",
            10),

    QUIZ_15("주식 시장에서 '블랙 스완'은 예측할 수 없는 큰 사건으로 인해 시장에 큰 영향을 주는 현상을 의미한다.",
            true,
            "맞습니다. 블랙 스완은 예측이 불가능한 큰 사건으로 인해 시장에 예상치 못한 영향을 미치는 현상을 나타냅니다.",
            10);

    private final String question;
    private final boolean answer;
    private final String explanation;
    private final int point;

    Quiz(String question, boolean answer, String explanation, int point) {
        this.question = question;
        this.answer = answer;
        this.explanation = explanation;
        this.point = point;
    }
}
