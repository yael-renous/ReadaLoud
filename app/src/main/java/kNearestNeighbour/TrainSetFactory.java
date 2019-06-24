package kNearestNeighbour;

import com.example.yael.readaloud.Grade;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class TrainSetFactory {

    public static ArrayList<Record> getTrainSet() {
        ArrayList<Record> output = new ArrayList<>();

        //Story version = 2nd grade,  Reader Level = 2nd grade
        createStoryV2ReaderL2(output);
        //Story version = 2nd grade,  Reader Level = 4th grade
        createStoryV2ReaderL4(output);
        //Story version = 2nd grade,  Reader Level = 6th grade
        createStoryV2ReaderL6(output);

        //Story version = 4th grade,  Reader Level = 2nd grade
        createStoryV4ReaderL2(output);
        //Story version = 4th grade,  Reader Level = 4th grade
        createStoryV4ReaderL4(output);
        //Story version = 4th grade,  Reader Level = 6th grade
        createStoryV4ReaderL6(output);

        //Story version = 6th grade,  Reader Level = 2nd grade
        createStoryV6ReaderL2(output);
        //Story version = 6th grade,  Reader Level = 4th grade
        createStoryV6ReaderL4(output);
        //Story version = 6th grade,  Reader Level = 6th grade
        createStoryV6ReaderL6(output);

        return output;
    }

    //================================= reader level 6 ============================================


    private static void createStoryV2ReaderL6(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.9123	);
        featVec2.put(Record.INSERTED_WORDS,0.0769	);
        featVec2.put(Record.DELETED_WORDS, 0.1962	);
        featVec2.put(Record.TIME_ELAPSED,0.17175	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.916084129	);
        featVec3.put(Record.INSERTED_WORDS,0.05598489	);
        featVec3.put(Record.DELETED_WORDS, 0.176009448	);
        featVec3.put(Record.TIME_ELAPSED,0.187744975	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.907545405	);
        featVec4.put(Record.INSERTED_WORDS,0.053925922	);
        featVec4.put(Record.DELETED_WORDS, 0.191674071	);
        featVec4.put(Record.TIME_ELAPSED,0.207181851	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.904861689	);
        featVec5.put(Record.INSERTED_WORDS,0.083320981	);
        featVec5.put(Record.DELETED_WORDS, 0.204220311	);
        featVec5.put(Record.TIME_ELAPSED,0.184476377	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.91237267	);
        featVec6.put(Record.INSERTED_WORDS,0.10448532	);
        featVec6.put(Record.DELETED_WORDS, 0.208950004	);
        featVec6.put(Record.TIME_ELAPSED,0.173918611	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.892893402	);
        featVec7.put(Record.INSERTED_WORDS,0.072506296	);
        featVec7.put(Record.DELETED_WORDS, 0.204786222	);
        featVec7.put(Record.TIME_ELAPSED,0.143019097	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.902287317	);
        featVec8.put(Record.INSERTED_WORDS,0.085055807	);
        featVec8.put(Record.DELETED_WORDS, 0.208622936	);
        featVec8.put(Record.TIME_ELAPSED,0.189686418	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.890898074	);
        featVec9.put(Record.INSERTED_WORDS,0.08185666	);
        featVec9.put(Record.DELETED_WORDS, 0.182332039	);
        featVec9.put(Record.TIME_ELAPSED,0.165746933	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.894013399	);
        featVec10.put(Record.INSERTED_WORDS,0.086907285	);
        featVec10.put(Record.DELETED_WORDS, 0.180466202	);
        featVec10.put(Record.TIME_ELAPSED,0.18720967	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.903295459	);
        featVec11.put(Record.INSERTED_WORDS,0.055967917	);
        featVec11.put(Record.DELETED_WORDS, 0.178928879	);
        featVec11.put(Record.TIME_ELAPSED,0.163739189	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.943168056	);
        featVec12.put(Record.INSERTED_WORDS,0.109373338	);
        featVec12.put(Record.DELETED_WORDS, 0.214844029	);
        featVec12.put(Record.TIME_ELAPSED,0.192819695	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.913296823	);
        featVec13.put(Record.INSERTED_WORDS,0.116201379	);
        featVec13.put(Record.DELETED_WORDS, 0.201029226	);
        featVec13.put(Record.TIME_ELAPSED,0.156187112	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.944310662	);
        featVec14.put(Record.INSERTED_WORDS,0.082715856	);
        featVec14.put(Record.DELETED_WORDS, 0.215484369	);
        featVec14.put(Record.TIME_ELAPSED,0.151009916	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.905005029	);
        featVec15.put(Record.INSERTED_WORDS,0.076051048	);
        featVec15.put(Record.DELETED_WORDS, 0.188930183	);
        featVec15.put(Record.TIME_ELAPSED,0.13449055	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.899219579	);
        featVec16.put(Record.INSERTED_WORDS,0.060551167	);
        featVec16.put(Record.DELETED_WORDS, 0.212420798	);
        featVec16.put(Record.TIME_ELAPSED,0.208088821	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.908346026	);
        featVec17.put(Record.INSERTED_WORDS,0.103100275	);
        featVec17.put(Record.DELETED_WORDS, 0.177514603	);
        featVec17.put(Record.TIME_ELAPSED,0.169564648	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.922514717	);
        featVec18.put(Record.INSERTED_WORDS,0.079747069	);
        featVec18.put(Record.DELETED_WORDS, 0.200599917	);
        featVec18.put(Record.TIME_ELAPSED,0.159435483	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.912163054	);
        featVec19.put(Record.INSERTED_WORDS,0.054497301	);
        featVec19.put(Record.DELETED_WORDS, 0.160325302	);
        featVec19.put(Record.TIME_ELAPSED,0.207531687	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.929060454	);
        featVec20.put(Record.INSERTED_WORDS,0.065240197	);
        featVec20.put(Record.DELETED_WORDS, 0.187371477	);
        featVec20.put(Record.TIME_ELAPSED,0.180838741	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.876870922	);
        featVec21.put(Record.INSERTED_WORDS,0.059678689	);
        featVec21.put(Record.DELETED_WORDS, 0.20386213	);
        featVec21.put(Record.TIME_ELAPSED,0.162713005	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.887089678	);
        featVec22.put(Record.INSERTED_WORDS,0.081996324	);
        featVec22.put(Record.DELETED_WORDS, 0.17378602	);
        featVec22.put(Record.TIME_ELAPSED,0.180390744	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.93239299	);
        featVec23.put(Record.INSERTED_WORDS,0.089836497	);
        featVec23.put(Record.DELETED_WORDS, 0.220153289	);
        featVec23.put(Record.TIME_ELAPSED,0.180466677	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.895298372	);
        featVec24.put(Record.INSERTED_WORDS,0.070032334	);
        featVec24.put(Record.DELETED_WORDS, 0.199328012	);
        featVec24.put(Record.TIME_ELAPSED,0.169377445	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.889692772	);
        featVec25.put(Record.INSERTED_WORDS,0.077183443	);
        featVec25.put(Record.DELETED_WORDS, 0.196841422	);
        featVec25.put(Record.TIME_ELAPSED,0.146712568	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.904642895	);
        featVec26.put(Record.INSERTED_WORDS,0.085578792	);
        featVec26.put(Record.DELETED_WORDS, 0.216353917	);
        featVec26.put(Record.TIME_ELAPSED,0.192790577	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.928931437	);
        featVec27.put(Record.INSERTED_WORDS,0.099775222	);
        featVec27.put(Record.DELETED_WORDS, 0.139727372	);
        featVec27.put(Record.TIME_ELAPSED,0.198694363	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.885813798	);
        featVec28.put(Record.INSERTED_WORDS,0.061142691	);
        featVec28.put(Record.DELETED_WORDS, 0.198081683	);
        featVec28.put(Record.TIME_ELAPSED,0.144480404	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.913000377	);
        featVec29.put(Record.INSERTED_WORDS,0.066129822	);
        featVec29.put(Record.DELETED_WORDS, 0.174662069	);
        featVec29.put(Record.TIME_ELAPSED,0.157398917	);
        output.add(new Record(Grade.SECOND	,Grade.SIXTH,featVec29));

    }

    private static void createStoryV4ReaderL6(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.93	);
        featVec2.put(Record.INSERTED_WORDS,0.1364	);
        featVec2.put(Record.DELETED_WORDS, 0.2373	);
        featVec2.put(Record.TIME_ELAPSED,0.21034	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.907945938	);
        featVec3.put(Record.INSERTED_WORDS,0.147911422	);
        featVec3.put(Record.DELETED_WORDS, 0.240620407	);
        featVec3.put(Record.TIME_ELAPSED,0.170744553	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.921858352	);
        featVec4.put(Record.INSERTED_WORDS,0.117124727	);
        featVec4.put(Record.DELETED_WORDS, 0.256439521	);
        featVec4.put(Record.TIME_ELAPSED,0.215103591	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.95080939	);
        featVec5.put(Record.INSERTED_WORDS,0.128637359	);
        featVec5.put(Record.DELETED_WORDS, 0.223729272	);
        featVec5.put(Record.TIME_ELAPSED,0.195274988	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.92111724	);
        featVec6.put(Record.INSERTED_WORDS,0.142896105	);
        featVec6.put(Record.DELETED_WORDS, 0.202317529	);
        featVec6.put(Record.TIME_ELAPSED,0.204512587	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.923223824	);
        featVec7.put(Record.INSERTED_WORDS,0.186135165	);
        featVec7.put(Record.DELETED_WORDS, 0.26152355	);
        featVec7.put(Record.TIME_ELAPSED,0.20880789	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.932428175	);
        featVec8.put(Record.INSERTED_WORDS,0.15297695	);
        featVec8.put(Record.DELETED_WORDS, 0.25446447	);
        featVec8.put(Record.TIME_ELAPSED,0.202451433	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.89451961	);
        featVec9.put(Record.INSERTED_WORDS,0.123221635	);
        featVec9.put(Record.DELETED_WORDS, 0.234427574	);
        featVec9.put(Record.TIME_ELAPSED,0.246503395	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.920550414	);
        featVec10.put(Record.INSERTED_WORDS,0.162239755	);
        featVec10.put(Record.DELETED_WORDS, 0.246973739	);
        featVec10.put(Record.TIME_ELAPSED,0.228906881	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.960111247	);
        featVec11.put(Record.INSERTED_WORDS,0.110988138	);
        featVec11.put(Record.DELETED_WORDS, 0.210951153	);
        featVec11.put(Record.TIME_ELAPSED,0.211085889	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.923918505	);
        featVec12.put(Record.INSERTED_WORDS,0.151687024	);
        featVec12.put(Record.DELETED_WORDS, 0.261176347	);
        featVec12.put(Record.TIME_ELAPSED,0.203144539	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.923972238	);
        featVec13.put(Record.INSERTED_WORDS,0.097672196	);
        featVec13.put(Record.DELETED_WORDS, 0.21778043	);
        featVec13.put(Record.TIME_ELAPSED,0.202913081	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.931403994	);
        featVec14.put(Record.INSERTED_WORDS,0.106900156	);
        featVec14.put(Record.DELETED_WORDS, 0.248952511	);
        featVec14.put(Record.TIME_ELAPSED,0.22934295	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.922577126	);
        featVec15.put(Record.INSERTED_WORDS,0.155639996	);
        featVec15.put(Record.DELETED_WORDS, 0.207848464	);
        featVec15.put(Record.TIME_ELAPSED,0.203735279	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.931273038	);
        featVec16.put(Record.INSERTED_WORDS,0.13145724	);
        featVec16.put(Record.DELETED_WORDS, 0.224924475	);
        featVec16.put(Record.TIME_ELAPSED,0.211549452	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.920485493	);
        featVec17.put(Record.INSERTED_WORDS,0.142634407	);
        featVec17.put(Record.DELETED_WORDS, 0.246992254	);
        featVec17.put(Record.TIME_ELAPSED,0.197002395	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.918661659	);
        featVec18.put(Record.INSERTED_WORDS,0.16629588	);
        featVec18.put(Record.DELETED_WORDS, 0.207573095	);
        featVec18.put(Record.TIME_ELAPSED,0.234084737	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.913571158	);
        featVec19.put(Record.INSERTED_WORDS,0.123354664	);
        featVec19.put(Record.DELETED_WORDS, 0.233103757	);
        featVec19.put(Record.TIME_ELAPSED,0.220975924	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.913030533	);
        featVec20.put(Record.INSERTED_WORDS,0.138885158	);
        featVec20.put(Record.DELETED_WORDS, 0.209118681	);
        featVec20.put(Record.TIME_ELAPSED,0.216421467	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.948934555	);
        featVec21.put(Record.INSERTED_WORDS,0.129466961	);
        featVec21.put(Record.DELETED_WORDS, 0.237391395	);
        featVec21.put(Record.TIME_ELAPSED,0.232068192	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.931211879	);
        featVec22.put(Record.INSERTED_WORDS,0.127971119	);
        featVec22.put(Record.DELETED_WORDS, 0.247954989	);
        featVec22.put(Record.TIME_ELAPSED,0.202264943	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.943128312	);
        featVec23.put(Record.INSERTED_WORDS,0.127910898	);
        featVec23.put(Record.DELETED_WORDS, 0.212099238	);
        featVec23.put(Record.TIME_ELAPSED,0.186992905	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.940642845	);
        featVec24.put(Record.INSERTED_WORDS,0.165343282	);
        featVec24.put(Record.DELETED_WORDS, 0.229624728	);
        featVec24.put(Record.TIME_ELAPSED,0.194998749	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.934020987	);
        featVec25.put(Record.INSERTED_WORDS,0.154494977	);
        featVec25.put(Record.DELETED_WORDS, 0.244635068	);
        featVec25.put(Record.TIME_ELAPSED,0.208536989	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.914519902	);
        featVec26.put(Record.INSERTED_WORDS,0.143958012	);
        featVec26.put(Record.DELETED_WORDS, 0.236134068	);
        featVec26.put(Record.TIME_ELAPSED,0.192870256	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.923958751	);
        featVec27.put(Record.INSERTED_WORDS,0.159011282	);
        featVec27.put(Record.DELETED_WORDS, 0.236319237	);
        featVec27.put(Record.TIME_ELAPSED,0.21355481	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.901376897	);
        featVec28.put(Record.INSERTED_WORDS,0.115370473	);
        featVec28.put(Record.DELETED_WORDS, 0.240062584	);
        featVec28.put(Record.TIME_ELAPSED,0.20155786	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.91555037	);
        featVec29.put(Record.INSERTED_WORDS,0.133850752	);
        featVec29.put(Record.DELETED_WORDS, 0.269567014	);
        featVec29.put(Record.TIME_ELAPSED,0.211371299	);
        output.add(new Record(Grade.FOURTH	,Grade.SIXTH,featVec29));

    }

    private static void createStoryV6ReaderL6(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.806	);
        featVec2.put(Record.INSERTED_WORDS,0.2064	);
        featVec2.put(Record.DELETED_WORDS, 0.3146	);
        featVec2.put(Record.TIME_ELAPSED,0.30415	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.745897016	);
        featVec3.put(Record.INSERTED_WORDS,0.200402012	);
        featVec3.put(Record.DELETED_WORDS, 0.333295181	);
        featVec3.put(Record.TIME_ELAPSED,0.339791745	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.827985238	);
        featVec4.put(Record.INSERTED_WORDS,0.137115604	);
        featVec4.put(Record.DELETED_WORDS, 0.320618186	);
        featVec4.put(Record.TIME_ELAPSED,0.303800035	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.776843095	);
        featVec5.put(Record.INSERTED_WORDS,0.235401261	);
        featVec5.put(Record.DELETED_WORDS, 0.376979464	);
        featVec5.put(Record.TIME_ELAPSED,0.313080704	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.784023468	);
        featVec6.put(Record.INSERTED_WORDS,0.194929944	);
        featVec6.put(Record.DELETED_WORDS, 0.31757269	);
        featVec6.put(Record.TIME_ELAPSED,0.278924761	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.808247914	);
        featVec7.put(Record.INSERTED_WORDS,0.198730865	);
        featVec7.put(Record.DELETED_WORDS, 0.325982304	);
        featVec7.put(Record.TIME_ELAPSED,0.278917635	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.824008293	);
        featVec8.put(Record.INSERTED_WORDS,0.170200345	);
        featVec8.put(Record.DELETED_WORDS, 0.303325178	);
        featVec8.put(Record.TIME_ELAPSED,0.306754129	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.796223725	);
        featVec9.put(Record.INSERTED_WORDS,0.160132681	);
        featVec9.put(Record.DELETED_WORDS, 0.31172794	);
        featVec9.put(Record.TIME_ELAPSED,0.2777937	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.817124393	);
        featVec10.put(Record.INSERTED_WORDS,0.242452467	);
        featVec10.put(Record.DELETED_WORDS, 0.295166316	);
        featVec10.put(Record.TIME_ELAPSED,0.272820912	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.816979166	);
        featVec11.put(Record.INSERTED_WORDS,0.188079638	);
        featVec11.put(Record.DELETED_WORDS, 0.313564087	);
        featVec11.put(Record.TIME_ELAPSED,0.292847299	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.798039012	);
        featVec12.put(Record.INSERTED_WORDS,0.227607618	);
        featVec12.put(Record.DELETED_WORDS, 0.286436239	);
        featVec12.put(Record.TIME_ELAPSED,0.29166714	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.759320108	);
        featVec13.put(Record.INSERTED_WORDS,0.204610522	);
        featVec13.put(Record.DELETED_WORDS, 0.28418798	);
        featVec13.put(Record.TIME_ELAPSED,0.3125316	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.80562585	);
        featVec14.put(Record.INSERTED_WORDS,0.206679357	);
        featVec14.put(Record.DELETED_WORDS, 0.316315879	);
        featVec14.put(Record.TIME_ELAPSED,0.287424664	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.798863819	);
        featVec15.put(Record.INSERTED_WORDS,0.209856118	);
        featVec15.put(Record.DELETED_WORDS, 0.280432574	);
        featVec15.put(Record.TIME_ELAPSED,0.292288814	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.792094264	);
        featVec16.put(Record.INSERTED_WORDS,0.209393289	);
        featVec16.put(Record.DELETED_WORDS, 0.344873942	);
        featVec16.put(Record.TIME_ELAPSED,0.325322644	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.794200573	);
        featVec17.put(Record.INSERTED_WORDS,0.192168019	);
        featVec17.put(Record.DELETED_WORDS, 0.272943429	);
        featVec17.put(Record.TIME_ELAPSED,0.304942358	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.791870325	);
        featVec18.put(Record.INSERTED_WORDS,0.196463655	);
        featVec18.put(Record.DELETED_WORDS, 0.29899031	);
        featVec18.put(Record.TIME_ELAPSED,0.316401686	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.766265457	);
        featVec19.put(Record.INSERTED_WORDS,0.210802051	);
        featVec19.put(Record.DELETED_WORDS, 0.289839845	);
        featVec19.put(Record.TIME_ELAPSED,0.307424796	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.840636083	);
        featVec20.put(Record.INSERTED_WORDS,0.215263392	);
        featVec20.put(Record.DELETED_WORDS, 0.326454232	);
        featVec20.put(Record.TIME_ELAPSED,0.311156587	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.799468033	);
        featVec21.put(Record.INSERTED_WORDS,0.202991177	);
        featVec21.put(Record.DELETED_WORDS, 0.300068978	);
        featVec21.put(Record.TIME_ELAPSED,0.309478675	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.787667741	);
        featVec22.put(Record.INSERTED_WORDS,0.251418479	);
        featVec22.put(Record.DELETED_WORDS, 0.335937892	);
        featVec22.put(Record.TIME_ELAPSED,0.319952967	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.847626203	);
        featVec23.put(Record.INSERTED_WORDS,0.20309287	);
        featVec23.put(Record.DELETED_WORDS, 0.307236297	);
        featVec23.put(Record.TIME_ELAPSED,0.311231594	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.806913565	);
        featVec24.put(Record.INSERTED_WORDS,0.188618564	);
        featVec24.put(Record.DELETED_WORDS, 0.348111691	);
        featVec24.put(Record.TIME_ELAPSED,0.300692847	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.784737413	);
        featVec25.put(Record.INSERTED_WORDS,0.218124601	);
        featVec25.put(Record.DELETED_WORDS, 0.307393412	);
        featVec25.put(Record.TIME_ELAPSED,0.302708508	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.837684993	);
        featVec26.put(Record.INSERTED_WORDS,0.215036805	);
        featVec26.put(Record.DELETED_WORDS, 0.323623753	);
        featVec26.put(Record.TIME_ELAPSED,0.316275198	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.809732128	);
        featVec27.put(Record.INSERTED_WORDS,0.245490323	);
        featVec27.put(Record.DELETED_WORDS, 0.313426021	);
        featVec27.put(Record.TIME_ELAPSED,0.293518451	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.792856525	);
        featVec28.put(Record.INSERTED_WORDS,0.19823886	);
        featVec28.put(Record.DELETED_WORDS, 0.307430338	);
        featVec28.put(Record.TIME_ELAPSED,0.297887925	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.809027714	);
        featVec29.put(Record.INSERTED_WORDS,0.168939694	);
        featVec29.put(Record.DELETED_WORDS, 0.301815271	);
        featVec29.put(Record.TIME_ELAPSED,0.263432137	);
        output.add(new Record(Grade.SIXTH	,Grade.SIXTH,featVec29));

    }


    //================================= reader level 4 ============================================

    private static void createStoryV2ReaderL4(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.8144	);
        featVec2.put(Record.INSERTED_WORDS,0.1507	);
        featVec2.put(Record.DELETED_WORDS, 0.2858	);
        featVec2.put(Record.TIME_ELAPSED,0.2691	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.8043309	);
        featVec3.put(Record.INSERTED_WORDS,0.136311848	);
        featVec3.put(Record.DELETED_WORDS, 0.261127312	);
        featVec3.put(Record.TIME_ELAPSED,0.255944044	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.809749353	);
        featVec4.put(Record.INSERTED_WORDS,0.140841548	);
        featVec4.put(Record.DELETED_WORDS, 0.301295883	);
        featVec4.put(Record.TIME_ELAPSED,0.268544995	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.84016053	);
        featVec5.put(Record.INSERTED_WORDS,0.167656305	);
        featVec5.put(Record.DELETED_WORDS, 0.305248985	);
        featVec5.put(Record.TIME_ELAPSED,0.246958713	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.801608173	);
        featVec6.put(Record.INSERTED_WORDS,0.164675967	);
        featVec6.put(Record.DELETED_WORDS, 0.258014758	);
        featVec6.put(Record.TIME_ELAPSED,0.266807919	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.793528355	);
        featVec7.put(Record.INSERTED_WORDS,0.189270561	);
        featVec7.put(Record.DELETED_WORDS, 0.289385885	);
        featVec7.put(Record.TIME_ELAPSED,0.233871232	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.769478639	);
        featVec8.put(Record.INSERTED_WORDS,0.175692506	);
        featVec8.put(Record.DELETED_WORDS, 0.291458402	);
        featVec8.put(Record.TIME_ELAPSED,0.257652455	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.811783586	);
        featVec9.put(Record.INSERTED_WORDS,0.174084113	);
        featVec9.put(Record.DELETED_WORDS, 0.246632162	);
        featVec9.put(Record.TIME_ELAPSED,0.267031233	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.818061239	);
        featVec10.put(Record.INSERTED_WORDS,0.13349402	);
        featVec10.put(Record.DELETED_WORDS, 0.291163248	);
        featVec10.put(Record.TIME_ELAPSED,0.259518344	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.821784731	);
        featVec11.put(Record.INSERTED_WORDS,0.177665927	);
        featVec11.put(Record.DELETED_WORDS, 0.309903588	);
        featVec11.put(Record.TIME_ELAPSED,0.242100754	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.793861541	);
        featVec12.put(Record.INSERTED_WORDS,0.149852443	);
        featVec12.put(Record.DELETED_WORDS, 0.283753292	);
        featVec12.put(Record.TIME_ELAPSED,0.291666177	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.7856895	);
        featVec13.put(Record.INSERTED_WORDS,0.177143627	);
        featVec13.put(Record.DELETED_WORDS, 0.337155043	);
        featVec13.put(Record.TIME_ELAPSED,0.274380004	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.833204178	);
        featVec14.put(Record.INSERTED_WORDS,0.17958305	);
        featVec14.put(Record.DELETED_WORDS, 0.2710858	);
        featVec14.put(Record.TIME_ELAPSED,0.288427973	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.788455776	);
        featVec15.put(Record.INSERTED_WORDS,0.178076915	);
        featVec15.put(Record.DELETED_WORDS, 0.2793937	);
        featVec15.put(Record.TIME_ELAPSED,0.265427688	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.822436494	);
        featVec16.put(Record.INSERTED_WORDS,0.16123565	);
        featVec16.put(Record.DELETED_WORDS, 0.310506426	);
        featVec16.put(Record.TIME_ELAPSED,0.283030198	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.824417653	);
        featVec17.put(Record.INSERTED_WORDS,0.155967685	);
        featVec17.put(Record.DELETED_WORDS, 0.296110072	);
        featVec17.put(Record.TIME_ELAPSED,0.276081884	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.845808294	);
        featVec18.put(Record.INSERTED_WORDS,0.132113454	);
        featVec18.put(Record.DELETED_WORDS, 0.283384793	);
        featVec18.put(Record.TIME_ELAPSED,0.259073021	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.840430528	);
        featVec19.put(Record.INSERTED_WORDS,0.153605934	);
        featVec19.put(Record.DELETED_WORDS, 0.272152028	);
        featVec19.put(Record.TIME_ELAPSED,0.271762365	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.819345169	);
        featVec20.put(Record.INSERTED_WORDS,0.159094838	);
        featVec20.put(Record.DELETED_WORDS, 0.283209933	);
        featVec20.put(Record.TIME_ELAPSED,0.272993026	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.800393631	);
        featVec21.put(Record.INSERTED_WORDS,0.137599165	);
        featVec21.put(Record.DELETED_WORDS, 0.297699688	);
        featVec21.put(Record.TIME_ELAPSED,0.26513894	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.849323451	);
        featVec22.put(Record.INSERTED_WORDS,0.174388759	);
        featVec22.put(Record.DELETED_WORDS, 0.292789338	);
        featVec22.put(Record.TIME_ELAPSED,0.297160089	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.821861281	);
        featVec23.put(Record.INSERTED_WORDS,0.145294256	);
        featVec23.put(Record.DELETED_WORDS, 0.315577673	);
        featVec23.put(Record.TIME_ELAPSED,0.258309689	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.783373152	);
        featVec24.put(Record.INSERTED_WORDS,0.147176921	);
        featVec24.put(Record.DELETED_WORDS, 0.279087014	);
        featVec24.put(Record.TIME_ELAPSED,0.286575056	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.824806933	);
        featVec25.put(Record.INSERTED_WORDS,0.162955582	);
        featVec25.put(Record.DELETED_WORDS, 0.268795884	);
        featVec25.put(Record.TIME_ELAPSED,0.299789795	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.792830189	);
        featVec26.put(Record.INSERTED_WORDS,0.196571838	);
        featVec26.put(Record.DELETED_WORDS, 0.279916537	);
        featVec26.put(Record.TIME_ELAPSED,0.271040346	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.815938333	);
        featVec27.put(Record.INSERTED_WORDS,0.157301726	);
        featVec27.put(Record.DELETED_WORDS, 0.325547332	);
        featVec27.put(Record.TIME_ELAPSED,0.25087944	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.799558564	);
        featVec28.put(Record.INSERTED_WORDS,0.145885899	);
        featVec28.put(Record.DELETED_WORDS, 0.301436689	);
        featVec28.put(Record.TIME_ELAPSED,0.260394831	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.837000523	);
        featVec29.put(Record.INSERTED_WORDS,0.168695177	);
        featVec29.put(Record.DELETED_WORDS, 0.285249011	);
        featVec29.put(Record.TIME_ELAPSED,0.240228155	);
        output.add(new Record(Grade.SECOND	,Grade.FOURTH,featVec29));
    }

    private static void createStoryV4ReaderL4(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.813	);
        featVec2.put(Record.INSERTED_WORDS,0.1505	);
        featVec2.put(Record.DELETED_WORDS, 0.2792	);
        featVec2.put(Record.TIME_ELAPSED,0.2909	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.842170061	);
        featVec3.put(Record.INSERTED_WORDS,0.16415695	);
        featVec3.put(Record.DELETED_WORDS, 0.294378416	);
        featVec3.put(Record.TIME_ELAPSED,0.287028199	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.821116171	);
        featVec4.put(Record.INSERTED_WORDS,0.141857786	);
        featVec4.put(Record.DELETED_WORDS, 0.305878782	);
        featVec4.put(Record.TIME_ELAPSED,0.31797404	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.80717472	);
        featVec5.put(Record.INSERTED_WORDS,0.176398156	);
        featVec5.put(Record.DELETED_WORDS, 0.251212844	);
        featVec5.put(Record.TIME_ELAPSED,0.275023512	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.816561952	);
        featVec6.put(Record.INSERTED_WORDS,0.124656634	);
        featVec6.put(Record.DELETED_WORDS, 0.295049283	);
        featVec6.put(Record.TIME_ELAPSED,0.295616061	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.827418404	);
        featVec7.put(Record.INSERTED_WORDS,0.150705763	);
        featVec7.put(Record.DELETED_WORDS, 0.289122235	);
        featVec7.put(Record.TIME_ELAPSED,0.320111642	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.785323121	);
        featVec8.put(Record.INSERTED_WORDS,0.16138564	);
        featVec8.put(Record.DELETED_WORDS, 0.292205674	);
        featVec8.put(Record.TIME_ELAPSED,0.306077218	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.817198075	);
        featVec9.put(Record.INSERTED_WORDS,0.149394861	);
        featVec9.put(Record.DELETED_WORDS, 0.280996299	);
        featVec9.put(Record.TIME_ELAPSED,0.281967384	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.817632627	);
        featVec10.put(Record.INSERTED_WORDS,0.128831221	);
        featVec10.put(Record.DELETED_WORDS, 0.238964973	);
        featVec10.put(Record.TIME_ELAPSED,0.293066614	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.821953502	);
        featVec11.put(Record.INSERTED_WORDS,0.13259148	);
        featVec11.put(Record.DELETED_WORDS, 0.263719094	);
        featVec11.put(Record.TIME_ELAPSED,0.283655991	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.812202863	);
        featVec12.put(Record.INSERTED_WORDS,0.139594381	);
        featVec12.put(Record.DELETED_WORDS, 0.273300955	);
        featVec12.put(Record.TIME_ELAPSED,0.304558832	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.813967557	);
        featVec13.put(Record.INSERTED_WORDS,0.141350571	);
        featVec13.put(Record.DELETED_WORDS, 0.280942939	);
        featVec13.put(Record.TIME_ELAPSED,0.280696448	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.82879663	);
        featVec14.put(Record.INSERTED_WORDS,0.165810411	);
        featVec14.put(Record.DELETED_WORDS, 0.288058508	);
        featVec14.put(Record.TIME_ELAPSED,0.321099194	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.807071982	);
        featVec15.put(Record.INSERTED_WORDS,0.143000003	);
        featVec15.put(Record.DELETED_WORDS, 0.297362566	);
        featVec15.put(Record.TIME_ELAPSED,0.275819497	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.818223686	);
        featVec16.put(Record.INSERTED_WORDS,0.14603899	);
        featVec16.put(Record.DELETED_WORDS, 0.304685604	);
        featVec16.put(Record.TIME_ELAPSED,0.276293323	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.819167348	);
        featVec17.put(Record.INSERTED_WORDS,0.19804898	);
        featVec17.put(Record.DELETED_WORDS, 0.281920344	);
        featVec17.put(Record.TIME_ELAPSED,0.268343659	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.828312199	);
        featVec18.put(Record.INSERTED_WORDS,0.123185838	);
        featVec18.put(Record.DELETED_WORDS, 0.297526251	);
        featVec18.put(Record.TIME_ELAPSED,0.287504994	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.816950921	);
        featVec19.put(Record.INSERTED_WORDS,0.150624266	);
        featVec19.put(Record.DELETED_WORDS, 0.294355132	);
        featVec19.put(Record.TIME_ELAPSED,0.278825179	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.792011551	);
        featVec20.put(Record.INSERTED_WORDS,0.152679141	);
        featVec20.put(Record.DELETED_WORDS, 0.27510575	);
        featVec20.put(Record.TIME_ELAPSED,0.277153338	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.792504633	);
        featVec21.put(Record.INSERTED_WORDS,0.118501805	);
        featVec21.put(Record.DELETED_WORDS, 0.280549748	);
        featVec21.put(Record.TIME_ELAPSED,0.303958317	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.80538559	);
        featVec22.put(Record.INSERTED_WORDS,0.203067943	);
        featVec22.put(Record.DELETED_WORDS, 0.32589983	);
        featVec22.put(Record.TIME_ELAPSED,0.264092005	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.77783506	);
        featVec23.put(Record.INSERTED_WORDS,0.158692752	);
        featVec23.put(Record.DELETED_WORDS, 0.289939717	);
        featVec23.put(Record.TIME_ELAPSED,0.321680326	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.858068085	);
        featVec24.put(Record.INSERTED_WORDS,0.161486917	);
        featVec24.put(Record.DELETED_WORDS, 0.259894969	);
        featVec24.put(Record.TIME_ELAPSED,0.251241321	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.847375232	);
        featVec25.put(Record.INSERTED_WORDS,0.142041454	);
        featVec25.put(Record.DELETED_WORDS, 0.271572318	);
        featVec25.put(Record.TIME_ELAPSED,0.299525416	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.848601047	);
        featVec26.put(Record.INSERTED_WORDS,0.160226616	);
        featVec26.put(Record.DELETED_WORDS, 0.291685859	);
        featVec26.put(Record.TIME_ELAPSED,0.302426765	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.806938418	);
        featVec27.put(Record.INSERTED_WORDS,0.180434688	);
        featVec27.put(Record.DELETED_WORDS, 0.303321062	);
        featVec27.put(Record.TIME_ELAPSED,0.249037033	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.777137372	);
        featVec28.put(Record.INSERTED_WORDS,0.15726637	);
        featVec28.put(Record.DELETED_WORDS, 0.254544197	);
        featVec28.put(Record.TIME_ELAPSED,0.296694092	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.807782737	);
        featVec29.put(Record.INSERTED_WORDS,0.138059146	);
        featVec29.put(Record.DELETED_WORDS, 0.294496824	);
        featVec29.put(Record.TIME_ELAPSED,0.290217995	);
        output.add(new Record(Grade.FOURTH	,Grade.FOURTH,featVec29));

    }

    private static void createStoryV6ReaderL4(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.7231	);
        featVec2.put(Record.INSERTED_WORDS,0.1548	);
        featVec2.put(Record.DELETED_WORDS, 0.2948	);
        featVec2.put(Record.TIME_ELAPSED,0.3078	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.713985726	);
        featVec3.put(Record.INSERTED_WORDS,0.0990793	);
        featVec3.put(Record.DELETED_WORDS, 0.27947316	);
        featVec3.put(Record.TIME_ELAPSED,0.29353717	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.719443379	);
        featVec4.put(Record.INSERTED_WORDS,0.135486005	);
        featVec4.put(Record.DELETED_WORDS, 0.275554405	);
        featVec4.put(Record.TIME_ELAPSED,0.307715512	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.716112286	);
        featVec5.put(Record.INSERTED_WORDS,0.148453242	);
        featVec5.put(Record.DELETED_WORDS, 0.322629098	);
        featVec5.put(Record.TIME_ELAPSED,0.268311169	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.734717095	);
        featVec6.put(Record.INSERTED_WORDS,0.171793226	);
        featVec6.put(Record.DELETED_WORDS, 0.287224105	);
        featVec6.put(Record.TIME_ELAPSED,0.311572784	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.713888817	);
        featVec7.put(Record.INSERTED_WORDS,0.175455082	);
        featVec7.put(Record.DELETED_WORDS, 0.30194655	);
        featVec7.put(Record.TIME_ELAPSED,0.313962748	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.701389327	);
        featVec8.put(Record.INSERTED_WORDS,0.16420407	);
        featVec8.put(Record.DELETED_WORDS, 0.277019566	);
        featVec8.put(Record.TIME_ELAPSED,0.327360802	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.72396892	);
        featVec9.put(Record.INSERTED_WORDS,0.177572469	);
        featVec9.put(Record.DELETED_WORDS, 0.286463132	);
        featVec9.put(Record.TIME_ELAPSED,0.322674531	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.717686277	);
        featVec10.put(Record.INSERTED_WORDS,0.181852597	);
        featVec10.put(Record.DELETED_WORDS, 0.260519889	);
        featVec10.put(Record.TIME_ELAPSED,0.313344591	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.724892515	);
        featVec11.put(Record.INSERTED_WORDS,0.152629341	);
        featVec11.put(Record.DELETED_WORDS, 0.323779302	);
        featVec11.put(Record.TIME_ELAPSED,0.310951091	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.753114334	);
        featVec12.put(Record.INSERTED_WORDS,0.162072531	);
        featVec12.put(Record.DELETED_WORDS, 0.320677711	);
        featVec12.put(Record.TIME_ELAPSED,0.290464797	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.73269964	);
        featVec13.put(Record.INSERTED_WORDS,0.172872777	);
        featVec13.put(Record.DELETED_WORDS, 0.292586015	);
        featVec13.put(Record.TIME_ELAPSED,0.314591106	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.716063757	);
        featVec14.put(Record.INSERTED_WORDS,0.171797263	);
        featVec14.put(Record.DELETED_WORDS, 0.331382305	);
        featVec14.put(Record.TIME_ELAPSED,0.282046519	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.693181612	);
        featVec15.put(Record.INSERTED_WORDS,0.166946442	);
        featVec15.put(Record.DELETED_WORDS, 0.324118029	);
        featVec15.put(Record.TIME_ELAPSED,0.308896278	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.702285041	);
        featVec16.put(Record.INSERTED_WORDS,0.133005494	);
        featVec16.put(Record.DELETED_WORDS, 0.313066951	);
        featVec16.put(Record.TIME_ELAPSED,0.316712943	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.744857035	);
        featVec17.put(Record.INSERTED_WORDS,0.142962614	);
        featVec17.put(Record.DELETED_WORDS, 0.302264038	);
        featVec17.put(Record.TIME_ELAPSED,0.282585157	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.713106314	);
        featVec18.put(Record.INSERTED_WORDS,0.144267623	);
        featVec18.put(Record.DELETED_WORDS, 0.304946808	);
        featVec18.put(Record.TIME_ELAPSED,0.321855993	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.746821733	);
        featVec19.put(Record.INSERTED_WORDS,0.16101333	);
        featVec19.put(Record.DELETED_WORDS, 0.288644378	);
        featVec19.put(Record.TIME_ELAPSED,0.276496669	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.740254942	);
        featVec20.put(Record.INSERTED_WORDS,0.143868794	);
        featVec20.put(Record.DELETED_WORDS, 0.274501383	);
        featVec20.put(Record.TIME_ELAPSED,0.34575764	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.74737014	);
        featVec21.put(Record.INSERTED_WORDS,0.141642325	);
        featVec21.put(Record.DELETED_WORDS, 0.302958522	);
        featVec21.put(Record.TIME_ELAPSED,0.295146418	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.747096011	);
        featVec22.put(Record.INSERTED_WORDS,0.142872077	);
        featVec22.put(Record.DELETED_WORDS, 0.329052458	);
        featVec22.put(Record.TIME_ELAPSED,0.303143386	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.722208477	);
        featVec23.put(Record.INSERTED_WORDS,0.165519718	);
        featVec23.put(Record.DELETED_WORDS, 0.285293217	);
        featVec23.put(Record.TIME_ELAPSED,0.340644892	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.711834353	);
        featVec24.put(Record.INSERTED_WORDS,0.139588262	);
        featVec24.put(Record.DELETED_WORDS, 0.293017179	);
        featVec24.put(Record.TIME_ELAPSED,0.277405662	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.706083883	);
        featVec25.put(Record.INSERTED_WORDS,0.128212003	);
        featVec25.put(Record.DELETED_WORDS, 0.304608856	);
        featVec25.put(Record.TIME_ELAPSED,0.310478939	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.745960071	);
        featVec26.put(Record.INSERTED_WORDS,0.158124645	);
        featVec26.put(Record.DELETED_WORDS, 0.290624375	);
        featVec26.put(Record.TIME_ELAPSED,0.280509425	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.720634008	);
        featVec27.put(Record.INSERTED_WORDS,0.131592742	);
        featVec27.put(Record.DELETED_WORDS, 0.301262251	);
        featVec27.put(Record.TIME_ELAPSED,0.312068287	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.725240039	);
        featVec28.put(Record.INSERTED_WORDS,0.165649279	);
        featVec28.put(Record.DELETED_WORDS, 0.274203864	);
        featVec28.put(Record.TIME_ELAPSED,0.316454306	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.704694943	);
        featVec29.put(Record.INSERTED_WORDS,0.149001274	);
        featVec29.put(Record.DELETED_WORDS, 0.301434893	);
        featVec29.put(Record.TIME_ELAPSED,0.322214618	);
        output.add(new Record(Grade.SIXTH	,Grade.FOURTH,featVec29));
    }

    //================================= reader level 2 ============================================

    private static void createStoryV2ReaderL2(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec1=new LinkedHashMap<>();
        featVec1.put(Record.CORRECT_WORDS,0.7218	);
        featVec1.put(Record.INSERTED_WORDS,0.1706	);
        featVec1.put(Record.DELETED_WORDS, 0.3682	);
        featVec1.put(Record.TIME_ELAPSED,0.2596	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec1));

        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.707767425	);
        featVec2.put(Record.INSERTED_WORDS,0.146614531	);
        featVec2.put(Record.DELETED_WORDS, 0.38590461	);
        featVec2.put(Record.TIME_ELAPSED,0.27968967	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.801655769	);
        featVec3.put(Record.INSERTED_WORDS,0.130156956	);
        featVec3.put(Record.DELETED_WORDS, 0.342239306	);
        featVec3.put(Record.TIME_ELAPSED,0.230071854	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.740558812	);
        featVec4.put(Record.INSERTED_WORDS,0.177405585	);
        featVec4.put(Record.DELETED_WORDS, 0.380850041	);
        featVec4.put(Record.TIME_ELAPSED,0.272786312	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.714745526	);
        featVec5.put(Record.INSERTED_WORDS,0.172555392	);
        featVec5.put(Record.DELETED_WORDS, 0.387344177	);
        featVec5.put(Record.TIME_ELAPSED,0.263653923	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.761871358	);
        featVec6.put(Record.INSERTED_WORDS,0.162333597	);
        featVec6.put(Record.DELETED_WORDS, 0.373406622	);
        featVec6.put(Record.TIME_ELAPSED,0.262215227	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.709129485	);
        featVec7.put(Record.INSERTED_WORDS,0.181578911	);
        featVec7.put(Record.DELETED_WORDS, 0.401764468	);
        featVec7.put(Record.TIME_ELAPSED,0.268652074	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.712041232	);
        featVec8.put(Record.INSERTED_WORDS,0.166064988	);
        featVec8.put(Record.DELETED_WORDS, 0.391255615	);
        featVec8.put(Record.TIME_ELAPSED,0.28165483	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.726042786	);
        featVec9.put(Record.INSERTED_WORDS,0.179648629	);
        featVec9.put(Record.DELETED_WORDS, 0.373398566	);
        featVec9.put(Record.TIME_ELAPSED,0.264111621	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.721930133	);
        featVec10.put(Record.INSERTED_WORDS,0.181039988	);
        featVec10.put(Record.DELETED_WORDS, 0.37284529	);
        featVec10.put(Record.TIME_ELAPSED,0.273597516	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.711826834	);
        featVec11.put(Record.INSERTED_WORDS,0.195456773	);
        featVec11.put(Record.DELETED_WORDS, 0.387896447	);
        featVec11.put(Record.TIME_ELAPSED,0.262053909	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.695255853	);
        featVec12.put(Record.INSERTED_WORDS,0.186909148	);
        featVec12.put(Record.DELETED_WORDS, 0.372072763	);
        featVec12.put(Record.TIME_ELAPSED,0.244119663	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.735594971	);
        featVec13.put(Record.INSERTED_WORDS,0.227464787	);
        featVec13.put(Record.DELETED_WORDS, 0.357068661	);
        featVec13.put(Record.TIME_ELAPSED,0.235701596	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.666371462	);
        featVec14.put(Record.INSERTED_WORDS,0.216479541	);
        featVec14.put(Record.DELETED_WORDS, 0.39493672	);
        featVec14.put(Record.TIME_ELAPSED,0.26549465	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.737748172	);
        featVec15.put(Record.INSERTED_WORDS,0.150459855	);
        featVec15.put(Record.DELETED_WORDS, 0.413050829	);
        featVec15.put(Record.TIME_ELAPSED,0.270412002	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.728644238	);
        featVec16.put(Record.INSERTED_WORDS,0.176041725	);
        featVec16.put(Record.DELETED_WORDS, 0.349205917	);
        featVec16.put(Record.TIME_ELAPSED,0.284260428	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.68975774	);
        featVec17.put(Record.INSERTED_WORDS,0.163253511	);
        featVec17.put(Record.DELETED_WORDS, 0.388441357	);
        featVec17.put(Record.TIME_ELAPSED,0.260954597	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.689981586	);
        featVec18.put(Record.INSERTED_WORDS,0.168112947	);
        featVec18.put(Record.DELETED_WORDS, 0.391887566	);
        featVec18.put(Record.TIME_ELAPSED,0.239457913	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.715184005	);
        featVec19.put(Record.INSERTED_WORDS,0.221123916	);
        featVec19.put(Record.DELETED_WORDS, 0.333405187	);
        featVec19.put(Record.TIME_ELAPSED,0.27835403	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.703590661	);
        featVec20.put(Record.INSERTED_WORDS,0.148559911	);
        featVec20.put(Record.DELETED_WORDS, 0.37371816	);
        featVec20.put(Record.TIME_ELAPSED,0.291186268	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.761799708	);
        featVec21.put(Record.INSERTED_WORDS,0.158592128	);
        featVec21.put(Record.DELETED_WORDS, 0.30741491	);
        featVec21.put(Record.TIME_ELAPSED,0.254373034	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.683940197	);
        featVec22.put(Record.INSERTED_WORDS,0.147233772	);
        featVec22.put(Record.DELETED_WORDS, 0.367920067	);
        featVec22.put(Record.TIME_ELAPSED,0.223045467	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.700312383	);
        featVec23.put(Record.INSERTED_WORDS,0.167612366	);
        featVec23.put(Record.DELETED_WORDS, 0.391147853	);
        featVec23.put(Record.TIME_ELAPSED,0.238949161	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.707424568	);
        featVec24.put(Record.INSERTED_WORDS,0.196087419	);
        featVec24.put(Record.DELETED_WORDS, 0.366178988	);
        featVec24.put(Record.TIME_ELAPSED,0.256002798	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.713783201	);
        featVec25.put(Record.INSERTED_WORDS,0.123243365	);
        featVec25.put(Record.DELETED_WORDS, 0.329314891	);
        featVec25.put(Record.TIME_ELAPSED,0.2608809	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.69088795	);
        featVec26.put(Record.INSERTED_WORDS,0.150879872	);
        featVec26.put(Record.DELETED_WORDS, 0.355690947	);
        featVec26.put(Record.TIME_ELAPSED,0.245484279	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.683447667	);
        featVec27.put(Record.INSERTED_WORDS,0.195849233	);
        featVec27.put(Record.DELETED_WORDS, 0.38827829	);
        featVec27.put(Record.TIME_ELAPSED,0.278727182	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.746072471	);
        featVec28.put(Record.INSERTED_WORDS,0.124069328	);
        featVec28.put(Record.DELETED_WORDS, 0.376512905	);
        featVec28.put(Record.TIME_ELAPSED,0.263837524	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.712169983	);
        featVec29.put(Record.INSERTED_WORDS,0.159080063	);
        featVec29.put(Record.DELETED_WORDS, 0.356305916	);
        featVec29.put(Record.TIME_ELAPSED,0.269703955	);
        output.add(new Record(Grade.SECOND	,Grade.SECOND,featVec29));
    }

    private static void createStoryV4ReaderL2(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.7079	);
        featVec2.put(Record.INSERTED_WORDS,0.16266	);
        featVec2.put(Record.DELETED_WORDS, 0.3753	);
        featVec2.put(Record.TIME_ELAPSED,0.2733	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.718948892	);
        featVec3.put(Record.INSERTED_WORDS,0.182515354	);
        featVec3.put(Record.DELETED_WORDS, 0.35444002	);
        featVec3.put(Record.TIME_ELAPSED,0.239661371	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.713829204	);
        featVec4.put(Record.INSERTED_WORDS,0.147950194	);
        featVec4.put(Record.DELETED_WORDS, 0.406643598	);
        featVec4.put(Record.TIME_ELAPSED,0.26008902	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.740051591	);
        featVec5.put(Record.INSERTED_WORDS,0.149807063	);
        featVec5.put(Record.DELETED_WORDS, 0.371488528	);
        featVec5.put(Record.TIME_ELAPSED,0.262059819	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.699523232	);
        featVec6.put(Record.INSERTED_WORDS,0.15191513	);
        featVec6.put(Record.DELETED_WORDS, 0.347907028	);
        featVec6.put(Record.TIME_ELAPSED,0.241321134	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.694561137	);
        featVec7.put(Record.INSERTED_WORDS,0.137906926	);
        featVec7.put(Record.DELETED_WORDS, 0.41512913	);
        featVec7.put(Record.TIME_ELAPSED,0.282582552	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.734691598	);
        featVec8.put(Record.INSERTED_WORDS,0.147219449	);
        featVec8.put(Record.DELETED_WORDS, 0.389490708	);
        featVec8.put(Record.TIME_ELAPSED,0.270627611	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.700120001	);
        featVec9.put(Record.INSERTED_WORDS,0.151088397	);
        featVec9.put(Record.DELETED_WORDS, 0.391485088	);
        featVec9.put(Record.TIME_ELAPSED,0.263676171	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.693615069	);
        featVec10.put(Record.INSERTED_WORDS,0.16230038	);
        featVec10.put(Record.DELETED_WORDS, 0.372564228	);
        featVec10.put(Record.TIME_ELAPSED,0.289986231	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.682390925	);
        featVec11.put(Record.INSERTED_WORDS,0.143926429	);
        featVec11.put(Record.DELETED_WORDS, 0.341887952	);
        featVec11.put(Record.TIME_ELAPSED,0.250451952	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.701912572	);
        featVec12.put(Record.INSERTED_WORDS,0.143039429	);
        featVec12.put(Record.DELETED_WORDS, 0.349247434	);
        featVec12.put(Record.TIME_ELAPSED,0.284852917	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.681035753	);
        featVec13.put(Record.INSERTED_WORDS,0.161361398	);
        featVec13.put(Record.DELETED_WORDS, 0.374423315	);
        featVec13.put(Record.TIME_ELAPSED,0.262886881	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.748120809	);
        featVec14.put(Record.INSERTED_WORDS,0.198149012	);
        featVec14.put(Record.DELETED_WORDS, 0.378586548	);
        featVec14.put(Record.TIME_ELAPSED,0.278493843	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.695692203	);
        featVec15.put(Record.INSERTED_WORDS,0.165581849	);
        featVec15.put(Record.DELETED_WORDS, 0.396868196	);
        featVec15.put(Record.TIME_ELAPSED,0.292363293	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.706043138	);
        featVec16.put(Record.INSERTED_WORDS,0.170532048	);
        featVec16.put(Record.DELETED_WORDS, 0.371858511	);
        featVec16.put(Record.TIME_ELAPSED,0.27928299	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.688014869	);
        featVec17.put(Record.INSERTED_WORDS,0.17463683	);
        featVec17.put(Record.DELETED_WORDS, 0.371369535	);
        featVec17.put(Record.TIME_ELAPSED,0.259272522	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.720120864	);
        featVec18.put(Record.INSERTED_WORDS,0.166490755	);
        featVec18.put(Record.DELETED_WORDS, 0.388371332	);
        featVec18.put(Record.TIME_ELAPSED,0.271567242	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.713771251	);
        featVec19.put(Record.INSERTED_WORDS,0.181907367	);
        featVec19.put(Record.DELETED_WORDS, 0.415055469	);
        featVec19.put(Record.TIME_ELAPSED,0.288772278	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.717092258	);
        featVec20.put(Record.INSERTED_WORDS,0.168573407	);
        featVec20.put(Record.DELETED_WORDS, 0.383102516	);
        featVec20.put(Record.TIME_ELAPSED,0.267538955	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.711956538	);
        featVec21.put(Record.INSERTED_WORDS,0.159253085	);
        featVec21.put(Record.DELETED_WORDS, 0.39262014	);
        featVec21.put(Record.TIME_ELAPSED,0.243817558	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.694313145	);
        featVec22.put(Record.INSERTED_WORDS,0.158241706	);
        featVec22.put(Record.DELETED_WORDS, 0.369837401	);
        featVec22.put(Record.TIME_ELAPSED,0.243888512	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.738550177	);
        featVec23.put(Record.INSERTED_WORDS,0.163829942	);
        featVec23.put(Record.DELETED_WORDS, 0.373037272	);
        featVec23.put(Record.TIME_ELAPSED,0.247526692	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.717261687	);
        featVec24.put(Record.INSERTED_WORDS,0.176463076	);
        featVec24.put(Record.DELETED_WORDS, 0.358605498	);
        featVec24.put(Record.TIME_ELAPSED,0.318487931	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.649870442	);
        featVec25.put(Record.INSERTED_WORDS,0.171584756	);
        featVec25.put(Record.DELETED_WORDS, 0.358388463	);
        featVec25.put(Record.TIME_ELAPSED,0.274152551	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.699791522	);
        featVec26.put(Record.INSERTED_WORDS,0.151170035	);
        featVec26.put(Record.DELETED_WORDS, 0.373540255	);
        featVec26.put(Record.TIME_ELAPSED,0.244770227	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.711547691	);
        featVec27.put(Record.INSERTED_WORDS,0.142481024	);
        featVec27.put(Record.DELETED_WORDS, 0.366874955	);
        featVec27.put(Record.TIME_ELAPSED,0.27093017	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.701767513	);
        featVec28.put(Record.INSERTED_WORDS,0.155096691	);
        featVec28.put(Record.DELETED_WORDS, 0.367325164	);
        featVec28.put(Record.TIME_ELAPSED,0.241290624	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.695772622	);
        featVec29.put(Record.INSERTED_WORDS,0.182719076	);
        featVec29.put(Record.DELETED_WORDS, 0.361449942	);
        featVec29.put(Record.TIME_ELAPSED,0.270686566	);
        output.add(new Record(Grade.FOURTH	,Grade.SECOND,featVec29));

    }

    private static void createStoryV6ReaderL2(ArrayList<Record> output) {
        LinkedHashMap<Integer,Double> featVec2=new LinkedHashMap<>();
        featVec2.put(Record.CORRECT_WORDS,0.4567	);
        featVec2.put(Record.INSERTED_WORDS,0.3012	);
        featVec2.put(Record.DELETED_WORDS, 0.4151	);
        featVec2.put(Record.TIME_ELAPSED,0.4123	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec2));

        LinkedHashMap<Integer,Double> featVec3=new LinkedHashMap<>();
        featVec3.put(Record.CORRECT_WORDS,0.459287613	);
        featVec3.put(Record.INSERTED_WORDS,0.287214271	);
        featVec3.put(Record.DELETED_WORDS, 0.429391755	);
        featVec3.put(Record.TIME_ELAPSED,0.402241806	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec3));

        LinkedHashMap<Integer,Double> featVec4=new LinkedHashMap<>();
        featVec4.put(Record.CORRECT_WORDS,0.4670607	);
        featVec4.put(Record.INSERTED_WORDS,0.316436847	);
        featVec4.put(Record.DELETED_WORDS, 0.414965963	);
        featVec4.put(Record.TIME_ELAPSED,0.412751552	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec4));

        LinkedHashMap<Integer,Double> featVec5=new LinkedHashMap<>();
        featVec5.put(Record.CORRECT_WORDS,0.444702071	);
        featVec5.put(Record.INSERTED_WORDS,0.259398142	);
        featVec5.put(Record.DELETED_WORDS, 0.438312884	);
        featVec5.put(Record.TIME_ELAPSED,0.403822593	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec5));

        LinkedHashMap<Integer,Double> featVec6=new LinkedHashMap<>();
        featVec6.put(Record.CORRECT_WORDS,0.482481765	);
        featVec6.put(Record.INSERTED_WORDS,0.291335902	);
        featVec6.put(Record.DELETED_WORDS, 0.407699016	);
        featVec6.put(Record.TIME_ELAPSED,0.405536799	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec6));

        LinkedHashMap<Integer,Double> featVec7=new LinkedHashMap<>();
        featVec7.put(Record.CORRECT_WORDS,0.466441331	);
        featVec7.put(Record.INSERTED_WORDS,0.277663594	);
        featVec7.put(Record.DELETED_WORDS, 0.427042417	);
        featVec7.put(Record.TIME_ELAPSED,0.390013372	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec7));

        LinkedHashMap<Integer,Double> featVec8=new LinkedHashMap<>();
        featVec8.put(Record.CORRECT_WORDS,0.435832541	);
        featVec8.put(Record.INSERTED_WORDS,0.284328842	);
        featVec8.put(Record.DELETED_WORDS, 0.420442173	);
        featVec8.put(Record.TIME_ELAPSED,0.381325619	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec8));

        LinkedHashMap<Integer,Double> featVec9=new LinkedHashMap<>();
        featVec9.put(Record.CORRECT_WORDS,0.461856875	);
        featVec9.put(Record.INSERTED_WORDS,0.348963559	);
        featVec9.put(Record.DELETED_WORDS, 0.422540499	);
        featVec9.put(Record.TIME_ELAPSED,0.455438709	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec9));

        LinkedHashMap<Integer,Double> featVec10=new LinkedHashMap<>();
        featVec10.put(Record.CORRECT_WORDS,0.451406097	);
        featVec10.put(Record.INSERTED_WORDS,0.343565255	);
        featVec10.put(Record.DELETED_WORDS, 0.415293639	);
        featVec10.put(Record.TIME_ELAPSED,0.398924999	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec10));

        LinkedHashMap<Integer,Double> featVec11=new LinkedHashMap<>();
        featVec11.put(Record.CORRECT_WORDS,0.453957529	);
        featVec11.put(Record.INSERTED_WORDS,0.319144173	);
        featVec11.put(Record.DELETED_WORDS, 0.385252647	);
        featVec11.put(Record.TIME_ELAPSED,0.43073777	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec11));

        LinkedHashMap<Integer,Double> featVec12=new LinkedHashMap<>();
        featVec12.put(Record.CORRECT_WORDS,0.470221689	);
        featVec12.put(Record.INSERTED_WORDS,0.291764633	);
        featVec12.put(Record.DELETED_WORDS, 0.392764869	);
        featVec12.put(Record.TIME_ELAPSED,0.391995433	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec12));

        LinkedHashMap<Integer,Double> featVec13=new LinkedHashMap<>();
        featVec13.put(Record.CORRECT_WORDS,0.46548269	);
        featVec13.put(Record.INSERTED_WORDS,0.311298874	);
        featVec13.put(Record.DELETED_WORDS, 0.436457995	);
        featVec13.put(Record.TIME_ELAPSED,0.38668263	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec13));

        LinkedHashMap<Integer,Double> featVec14=new LinkedHashMap<>();
        featVec14.put(Record.CORRECT_WORDS,0.427132182	);
        featVec14.put(Record.INSERTED_WORDS,0.265820751	);
        featVec14.put(Record.DELETED_WORDS, 0.393992292	);
        featVec14.put(Record.TIME_ELAPSED,0.399675575	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec14));

        LinkedHashMap<Integer,Double> featVec15=new LinkedHashMap<>();
        featVec15.put(Record.CORRECT_WORDS,0.45532657	);
        featVec15.put(Record.INSERTED_WORDS,0.306248807	);
        featVec15.put(Record.DELETED_WORDS, 0.398047722	);
        featVec15.put(Record.TIME_ELAPSED,0.407899448	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec15));

        LinkedHashMap<Integer,Double> featVec16=new LinkedHashMap<>();
        featVec16.put(Record.CORRECT_WORDS,0.455695097	);
        featVec16.put(Record.INSERTED_WORDS,0.309386916	);
        featVec16.put(Record.DELETED_WORDS, 0.41257131	);
        featVec16.put(Record.TIME_ELAPSED,0.40421552	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec16));

        LinkedHashMap<Integer,Double> featVec17=new LinkedHashMap<>();
        featVec17.put(Record.CORRECT_WORDS,0.435798071	);
        featVec17.put(Record.INSERTED_WORDS,0.279963809	);
        featVec17.put(Record.DELETED_WORDS, 0.451875641	);
        featVec17.put(Record.TIME_ELAPSED,0.389233161	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec17));

        LinkedHashMap<Integer,Double> featVec18=new LinkedHashMap<>();
        featVec18.put(Record.CORRECT_WORDS,0.470448958	);
        featVec18.put(Record.INSERTED_WORDS,0.291078682	);
        featVec18.put(Record.DELETED_WORDS, 0.456050255	);
        featVec18.put(Record.TIME_ELAPSED,0.399607834	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec18));

        LinkedHashMap<Integer,Double> featVec19=new LinkedHashMap<>();
        featVec19.put(Record.CORRECT_WORDS,0.448030264	);
        featVec19.put(Record.INSERTED_WORDS,0.288653923	);
        featVec19.put(Record.DELETED_WORDS, 0.416027064	);
        featVec19.put(Record.TIME_ELAPSED,0.416074434	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec19));

        LinkedHashMap<Integer,Double> featVec20=new LinkedHashMap<>();
        featVec20.put(Record.CORRECT_WORDS,0.432915761	);
        featVec20.put(Record.INSERTED_WORDS,0.315016099	);
        featVec20.put(Record.DELETED_WORDS, 0.440689035	);
        featVec20.put(Record.TIME_ELAPSED,0.392999821	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec20));

        LinkedHashMap<Integer,Double> featVec21=new LinkedHashMap<>();
        featVec21.put(Record.CORRECT_WORDS,0.516000868	);
        featVec21.put(Record.INSERTED_WORDS,0.342791638	);
        featVec21.put(Record.DELETED_WORDS, 0.403506865	);
        featVec21.put(Record.TIME_ELAPSED,0.435177113	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec21));

        LinkedHashMap<Integer,Double> featVec22=new LinkedHashMap<>();
        featVec22.put(Record.CORRECT_WORDS,0.457847213	);
        featVec22.put(Record.INSERTED_WORDS,0.330231068	);
        featVec22.put(Record.DELETED_WORDS, 0.411368316	);
        featVec22.put(Record.TIME_ELAPSED,0.416155433	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec22));

        LinkedHashMap<Integer,Double> featVec23=new LinkedHashMap<>();
        featVec23.put(Record.CORRECT_WORDS,0.468330149	);
        featVec23.put(Record.INSERTED_WORDS,0.291070567	);
        featVec23.put(Record.DELETED_WORDS, 0.428275651	);
        featVec23.put(Record.TIME_ELAPSED,0.383318295	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec23));

        LinkedHashMap<Integer,Double> featVec24=new LinkedHashMap<>();
        featVec24.put(Record.CORRECT_WORDS,0.431375625	);
        featVec24.put(Record.INSERTED_WORDS,0.306514339	);
        featVec24.put(Record.DELETED_WORDS, 0.428020435	);
        featVec24.put(Record.TIME_ELAPSED,0.45061384	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec24));

        LinkedHashMap<Integer,Double> featVec25=new LinkedHashMap<>();
        featVec25.put(Record.CORRECT_WORDS,0.460745552	);
        featVec25.put(Record.INSERTED_WORDS,0.303504168	);
        featVec25.put(Record.DELETED_WORDS, 0.419837671	);
        featVec25.put(Record.TIME_ELAPSED,0.437449378	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec25));

        LinkedHashMap<Integer,Double> featVec26=new LinkedHashMap<>();
        featVec26.put(Record.CORRECT_WORDS,0.455441411	);
        featVec26.put(Record.INSERTED_WORDS,0.288299086	);
        featVec26.put(Record.DELETED_WORDS, 0.393216628	);
        featVec26.put(Record.TIME_ELAPSED,0.419826902	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec26));

        LinkedHashMap<Integer,Double> featVec27=new LinkedHashMap<>();
        featVec27.put(Record.CORRECT_WORDS,0.462321452	);
        featVec27.put(Record.INSERTED_WORDS,0.2904421	);
        featVec27.put(Record.DELETED_WORDS, 0.364201499	);
        featVec27.put(Record.TIME_ELAPSED,0.438792603	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec27));

        LinkedHashMap<Integer,Double> featVec28=new LinkedHashMap<>();
        featVec28.put(Record.CORRECT_WORDS,0.435851146	);
        featVec28.put(Record.INSERTED_WORDS,0.288380919	);
        featVec28.put(Record.DELETED_WORDS, 0.406595378	);
        featVec28.put(Record.TIME_ELAPSED,0.414733564	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec28));

        LinkedHashMap<Integer,Double> featVec29=new LinkedHashMap<>();
        featVec29.put(Record.CORRECT_WORDS,0.49625096	);
        featVec29.put(Record.INSERTED_WORDS,0.33463982	);
        featVec29.put(Record.DELETED_WORDS, 0.42322188	);
        featVec29.put(Record.TIME_ELAPSED,0.399291838	);
        output.add(new Record(Grade.SIXTH	,Grade.SECOND,featVec29));


    }


}