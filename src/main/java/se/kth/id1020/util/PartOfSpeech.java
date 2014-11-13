package se.kth.id1020.util;

import java.util.HashMap;

/**
 * Created by Mahmoud Ismail.
 */
public enum PartOfSpeech {

    /*
    https://github.com/nltk/nltk/blob/develop/nltk/tag/mapping.py
    VERB - verbs (all tenses and modes)
    NOUN - nouns (common and proper)
    PRON - pronouns
    ADJ - adjectives
    ADV - adverbs
    ADP - adpositions (prepositions and postpositions)
    CONJ - conjunctions
    DET - determiners
    NUM - cardinal numbers
    PRT - particles or other function words
    X - other: foreign words, typos, abbreviations
    . - punctuation
     */

    ADV,
    NOUN,
    NUM,
    ADP,
    PRON,
    DET,
    PUNCTUATION,
    PRT,
    VERB,
    Other,
    CONJ,
    ADJ;

    static HashMap<String, String> tagsToMeaningfulAlternative = new HashMap<String, String>() {{
        put("bedz-nc", "verb");
        put("np$", "noun");
        put("at-tl", "det");
        put("bedz*", "verb");
        put("np+hvz", "prt");
        put("in-tl-hl", "adp");
        put("nr-hl", "noun");
        put("cc-tl-hl", "conj");
        put("nns$-hl", "noun");
        put("jjs-hl", "adj");
        put("jj-hl", "adj");
        put("wrb-tl", "adv");
        put("pp$-hl", "det");
        put("wrb", "adv");
        put("dod*", "verb");
        put("ber*-nc", "verb");
        put(")-hl", ".");
        put("nps$-hl", "noun");
        put(".-hl", ".");
        put("fw-ppss", "x");
        put("np+hvz-nc", "prt");
        put("nns$", "noun");
        put("--", ".");
        put("cc-tl", "conj");
        put("fw-nn-tl", "x");
        put("np-tl-hl", "noun");
        put("ppss+md", "prt");
        put("nps", "noun");
        put("rbr+cs", "adv");
        put("dti", "det");
        put("ben", "verb");
        put("bem", "verb");
        put("fw-at+np-tl", "x");
        put("ex+bez", "prt");
        put("beg", "verb");
        put("bed", "verb");
        put("bez", "verb");
        put("dtx", "det");
        put("dod*-tl", "verb");
        put("fw-vb-nc", "x");
        put("ber", "verb");
        put("dts+bez", "prt");
        put("ql-hl", "adv");
        put("np$-tl", "noun");
        put("wql", "adv");
        put("jjr+cs", "adj");
        put("bed*", "verb");
        put("nn-tl-hl", "noun");
        put("hvd-hl", "verb");
        put("np+bez-nc", "prt");
        put("vbn+to", "verb");
        put("*-tl", "adv");
        put("wdt-hl", "det");
        put("md", "verb");
        put("nn-hl", "noun");
        put("fw-be", "x");
        put("dt$", "det");
        put("pn-tl", "noun");
        put("dt-hl", "det");
        put("fw-nr-tl", "x");
        put("vbg", "verb");
        put("vbd", "verb");
        put("vbn", "verb");
        put("dod", "verb");
        put("fw-vbg-tl", "x");
        put("doz", "verb");
        put("abn-tl", "prt");
        put("vb+jj-nc", "verb");
        put("at-hl", "det");
        put("rb+cs", "adv");
        put("fw-pn", "x");
        put("ppss+bem", "prt");
        put("vbg-nc", "verb");
        put("ber-hl", "verb");
        put("md*", "verb");
        put("``", ".");
        put("wps-tl", "pron");
        put("od-tl", "adj");
        put("ppss-hl", "pron");
        put("pps+md", "prt");
        put("do*", "verb");
        put("do-hl", "verb");
        put("hvg-hl", "verb");
        put("wrb-hl", "adv");
        put("jjt", "adj");
        put("jjs", "adj");
        put("jjr", "adj");
        put("vb+in", "verb");
        put("dod-nc", "verb");
        put("cc-hl", "conj");
        put("fw-ppss+hv", "x");
        put("fw-np-tl", "x");
        put("ap+ap-nc", "adj");
        put("jjt-nc", "adj");
        put("wdt+bez-tl", "prt");
        put("---hl", ".");
        put("pn$", "noun");
        put("vb+ppo", "verb");
        put("be-tl", "verb");
        put("vbg-tl", "verb");
        put("np$-hl", "noun");
        put("vbz-tl", "verb");
        put("uh", "prt");
        put("fw-wpo", "x");
        put("wrb+dod*", "prt");
        put("fw-in", "x");
        put("nrs-tl", "noun");
        put("abl", "prt");
        put("abn", "prt");
        put("to-tl", "prt");
        put("abx", "det");
        put("*-hl", "adv");
        put("fw-wps", "x");
        put("vb-nc", "verb");
        put("hvd*", "verb");
        put("pps+hvd", "prt");
        put("fw-in+at", "x");
        put("fw-np", "x");
        put("qlp", "adv");
        put("fw-nr", "x");
        put("fw-nn", "x");
        put("pps+hvz", "prt");
        put("nns-nc", "noun");
        put("dt+bez-nc", "prt");
        put("fw-in+nn-tl", "x");
        put("ppo-nc", "pron");
        put("rb-hl", "adv");
        put("ex-hl", "prt");
        put("ap$", "prt");
        put("od-nc", "adj");
        put("rp", "prt");
        put("wps+bez", "prt");
        put("nn+bez", "prt");
        put(".-tl", ".");
        put(",", ".");
        put("fw-dt+bez", "x");
        put("rb", "adv");
        put("fw-pp$-nc", "x");
        put("rn", "adv");
        put("jj$-tl", "prt");
        put("md-nc", "verb");
        put("vbd-nc", "verb");
        put("ppss+ber-n", "prt");
        put("rb+bez-nc", "prt");
        put("wps-hl", "pron");
        put("vbn-nc", "verb");
        put("bez-hl", "verb");
        put("ppl-nc", "pron");
        put("ber-tl", "verb");
        put("pp$$", "pron");
        put("nns+md", "prt");
        put("pps-nc", "pron");
        put("fw-uh-nc", "x");
        put("ap-hl", "adj");
        put("ppss+ber-tl", "prt");
        put("nr-nc", "noun");
        put("fw-jj", "x");
        put("ap-nc", "adj");
        put("nps$", "noun");
        put("rb-tl", "adv");
        put("to-nc", "prt");
        put("bem*", "verb");
        put("'", ".");
        put("fw-cc", "x");
        put("np+md", "prt");
        put("ex+hvz", "prt");
        put("fw-cd", "x");
        put("ex+hvd", "prt");
        put("in-hl", "adp");
        put("fw-cs", "x");
        put("jjr-hl", "adj");
        put("fw-in+np-tl", "x");
        put("jj-tl-hl", "adj");
        put("fw-uh", "x");
        put("ex", "prt");
        put("fw-nns-nc", "x");
        put("fw-jj-nc", "x");
        put("vbz-hl", "verb");
        put("vb+rp", "verb");
        put("bez-nc", "verb");
        put("ppss+hv-tl", "prt");
        put("vb-tl", "verb");
        put("hv*", "verb");
        put("doz*", "verb");
        put("pp$-nc", "det");
        put("np-nc", "noun");
        put("nps-tl", "noun");
        put("pp$-tl", "det");
        put("fw-*-tl", "x");
        put("fw-od-tl", "x");
        put("wps", "pron");
        put("wpo", "pron");
        put("md+ppss", "verb");
        put("wdt+ber", "prt");
        put("wdt+bez", "prt");
        put("cd-hl", "num");
        put("wdt+bez-nc", "prt");
        put("wp$", "det");
        put("do+ppss", "x");
        put("hv-hl", "verb");
        put("dt-nc", "det");
        put("pn-nc", "noun");
        put("fw-vbz", "x");
        put("hvd", "verb");
        put("hvg", "verb");
        put("nn+bez-tl", "prt");
        put("hvz", "verb");
        put("fw-vbd", "x");
        put("fw-vbg", "x");
        put("nns$-tl", "noun");
        put("jj-tl", "adj");
        put("fw-vbn", "x");
        put("md-tl", "verb");
        put("wdt+dod", "prt");
        put("hv-tl", "verb");
        put("nn-tl", "noun");
        put("ppss", "pron");
        put("nr$", "noun");
        put("dts", "det");
        put("fw-vb", "x");
        put("dt", "det");
        put("pn+bez", "prt");
        put("vbg-hl", "verb");
        put("fw-ppl+vbz", "x");
        put("fw-nps-tl", "x");
        put("rb$", "prt");
        put("pn+hvz", "prt");
        put("fw-in+nn", "x");
        put("fw-cc-tl", "x");
        put("rbt", "adv");
        put("rbr", "adv");
        put("pps-tl", "pron");
        put("ppss+hv", "prt");
        put("jjs-tl", "adj");
        put(",-nc", ".");
        put("wps+bez-tl", "prt");
        put("nns-tl-hl", "noun");
        put("vbn-tl-nc", "verb");
        put("ql-tl", "adv");
        put("nn+nn-nc", "noun");
        put("jjr-tl", "adj");
        put("nn$-tl", "noun");
        put("fw-ql", "x");
        put("in-tl", "adp");
        put("in+ppo", "adp");
        put("nrs", "noun");
        put("pn+md", "prt");
        put("ql", "adv");
        put("vbg+to", "verb");
        put("jjt-tl", "adj");
        put("wrb+ber", "prt");
        put("jj", "adj");
        put("wrb+bez", "prt");
        put("nns$-tl-hl", "noun");
        put("ppss+bez", "prt");
        put("(", ".");
        put("ppss+ber", "prt");
        put("dt+md", "prt");
        put("doz-tl", "verb");
        put("cs-nc", "adp");
        put("fw-pp$", "x");
        put("rb+bez-hl", "prt");
        put("fw-rb+cc", "x");
        put("fw-pps", "x");
        put("do*-hl", "verb");
        put("nr+md", "prt");
        put("ppls", "pron");
        put("in+in", "adp");
        put("bez*", "verb");
        put("fw-ppl", "x");
        put("fw-ppo", "x");
        put("nns-hl", "noun");
        put("nil", "x");
        put("hvn", "verb");
        put("ppss+ber-nc", "prt");
        put("ap-tl", "adj");
        put("fw-dt", "x");
        put("(-hl", ".");
        put("dti-tl", "det");
        put("jj+jj-nc", "adj");
        put("fw-rb", "x");
        put("fw-vbd-tl", "x");
        put("ber-nc", "verb");
        put("nns$-nc", "noun");
        put("jj-nc", "adj");
        put("nps$-tl", "noun");
        put("vb+vb-nc", "verb");
        put("pn", "noun");
        put("vb+to", "verb");
        put("at-tl-hl", "det");
        put("bem-nc", "verb");
        put("ppl-tl", "pron");
        put("abn-hl", "prt");
        put("rb-nc", "adv");
        put("do-nc", "verb");
        put("be-hl", "verb");
        put("wrb+in", "prt");
        put("fw-uh-tl", "x");
        put("ppo-hl", "pron");
        put("fw-cd-tl", "x");
        put("to-hl", "prt");
        put("pps+bez", "prt");
        put("cd$", "noun");
        put("do", "verb");
        put("ex+md", "prt");
        put("hvz-tl", "verb");
        put("in-nc", "adp");
        put(".", ".");
        put("wrb+do", "prt");
        put("cd-nc", "num");
        put("fw-ppo+in", "x");
        put("fw-nn$-tl", "x");
        put("uh-nc", "prt");
        put("rp-hl", "prt");
        put("cc", "conj");
        put("nn+hvz-tl", "prt");
        put("cd", "num");
        put("dt+bez", "prt");
        put("wps+hvz", "prt");
        put("cs", "adp");
        put("np-tl", "noun");
        put(":-tl", ".");
        put("nn-nc", "noun");
        put("wpo-tl", "pron");
        put("ql-nc", "adv");
        put("fw-at+nn-tl", "x");
        put("wdt+hvz", "prt");
        put(".-nc", ".");
        put("fw-dts", "x");
        put("np-hl", "noun");
        put(":-hl", ".");
        put("rbr-nc", "adv");
        put("od-hl", "adj");
        put("bedz-hl", "verb");
        put("vbd-tl", "verb");
        put("nps-nc", "noun");
        put(")", ".");
        put("to+vb", "prt");
        put("ppo", "pron");
        put("ppl", "pron");
        put("pps", "pron");
        put("ppss+vb", "prt");
        put("dt-tl", "det");
        put("rp-nc", "prt");
        put("vb", "verb");
        put("nn$", "noun");
        put("pp$", "det");
        put("vbd-hl", "verb");
        put("dti-hl", "det");
        put("nn-tl-nc", "noun");
        put("ppl-hl", "pron");
        put("in", "adp");
        put("wrb+md", "prt");
        put("md+to", "verb");
        put("fw-in-tl", "x");
        put("pn+hvd", "prt");
        put("ben-tl", "verb");
        put("be", "verb");
        put("wdt", "det");
        put("wps+hvd", "prt");
        put("do-tl", "verb");
        put("fw-nn-nc", "x");
        put("wrb+bez-tl", "prt");
        put("uh-tl", "prt");
        put("fw-nns-tl", "x");
        put("jjr-nc", "adj");
        put("nns", "noun");
        put("ppss-nc", "pron");
        put("wps+bez-nc", "prt");
        put(",-tl", ".");
        put("fw-vb-tl", "x");
        put("vbn-tl-hl", "verb");
        put("wdt-nc", "det");
        put("od", "adj");
        put("fw-od-nc", "x");
        put("doz*-tl", "verb");
        put("ppss+hvd", "prt");
        put("cs-tl", "adp");
        put("wrb+doz", "prt");
        put("cc-nc", "conj");
        put("hv", "verb");
        put("nn$-hl", "noun");
        put("fw-wdt", "x");
        put("wrb+dod", "prt");
        put("nn+hvz", "prt");
        put("at-nc", "det");
        put("nns-tl", "noun");
        put("fw-bez", "x");
        put("cs-hl", "adp");
        put("wpo-nc", "pron");
        put("fw-ber", "x");
        put("nns-tl-nc", "noun");
        put("bez-tl", "verb");
        put("fw-in+at-t", "x");
        put("abn-nc", "prt");
        put("bedz", "verb");
        put("np+bez", "prt");
        put("fw-at-tl", "x");
        put("ber*", "verb");
        put("wps+md", "prt");
        put("md-hl", "verb");
        put("nn+md", "prt");
        put("hv-nc", "verb");
        put("wps-nc", "pron");
        put("vbn-hl", "verb");
        put("fw-to+vb", "x");
        put("ppss+md-nc", "prt");
        put("hvz*", "verb");
        put("pps-hl", "pron");
        put("wrb-nc", "adv");
        put("vbz", "verb");
        put("vbn-tl", "verb");
        put("cd-tl-hl", "num");
        put("nps-hl", "noun");
        put("rp-tl", "prt");
        put("pps+bez-nc", "prt");
        put("fw-hv", "x");
        put("wql-tl", "adv");
        put("fw-at", "x");
        put("nn", "noun");
        put("nr$-tl", "noun");
        put("vbz-nc", "verb");
        put("*", "adv");
        put("ppss-tl", "pron");
        put("jjt-hl", "adj");
        put("fw-nns", "x");
        put("np", "noun");
        put("uh-hl", "prt");
        put("nr", "noun");
        put(":", ".");
        put("fw-nn$", "x");
        put("rp+in", "prt");
        put(",-hl", ".");
        put("jj-tl-nc", "adj");
        put("pps+bez-hl", "prt");
        put("*-nc", "adv");
        put("vb-hl", "verb");
        put("hvz-nc", "verb");
        put("dts-hl", "det");
        put("fw-jjt", "x");
        put("fw-jjr", "x");
        put("fw-jj-tl", "x");
        put("fw-*", "x");
        put("rb+bez", "prt");
        put("''", ".");
        put("vb+at", "verb");
        put("wdt+ber+pp", "x");
        put("ppo-tl", "pron");
        put("cd-tl", "num");
        put("wdt+bez-hl", "prt");
        put("fw-nn-tl-nc", "x");
        put("ex-nc", "prt");
        put("ppss+bez*", "prt");
        put("to", "prt");
        put("wdt+do+pps", "x");
        put("bed-nc", "verb");
        put("ap", "adj");
        put("at", "det");
        put("doz-hl", "verb");
        put("fw-rb-tl", "x");
        put("hv+to", "verb");
        put("nn+in", "noun");
        put("fw-at-hl", "x");
        put("md*-hl", "verb");
        put("fw-pp$-tl", "x");
        put("fw-nps", "x");
        put("pn-hl", "noun");
        put("nn+hvd-tl", "prt");
        put("md+hv", "verb");
        put("fw-in+at-tl", "x");

        put("nr-tl", "noun");
        put("nr-tl-hl", "noun");
    }};

    public static PartOfSpeech getType(String tag) {
        String alt = tagsToMeaningfulAlternative.get(tag);
        if (alt.equals("verb")) {
            return VERB;
        } else if (alt.equals("adv")) {
            return ADV;
        } else if (alt.equals("noun")) {
            return NOUN;
        } else if (alt.equals("num")) {
            return NUM;
        } else if (alt.equals("adp")) {
            return ADP;
        } else if (alt.equals("det")) {
            return DET;
        } else if (alt.equals(".")) {
            return PUNCTUATION;
        } else if (alt.equals("prt")) {
            return PRT;
        } else if (alt.equals("conj")) {
            return CONJ;
        } else if (alt.equals("adj")) {
            return ADJ;
        } else if (alt.equals("pron")) {
            return PRON;
        } else {
            return Other;
        }
    }
}
