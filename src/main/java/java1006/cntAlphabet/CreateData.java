package java1006.cntAlphabet;

import java.util.HashMap;

public class CreateData {
    HashMap<String, String> map = new HashMap<>();
    HashMap<Character, Integer> alphabet = new HashMap<>();
    String[] names = {
                "권하준",
                "조성윤",
                "안예은",
                "남우빈",
                "최경민",
                "안준휘",
                "하채민",
                "허도한",
                "배태훈",
                "정해성",
                "하찬희",
                "박도아",
                "유경준",
                "고다니엘",
                "하이안",
                "고유호",
                "전민찬",
                "배강",
                "유서이",
                "황도빈",
                "강규진",
                "임예린",
                "양예온",
                "곽윤재",
                "한단",
                "박강현",
                "윤성민",
                "박재윤",
                "서현준",
                "노유주",
                "전율",
                "노아린",
                "권아윤",
                "송태서",
                "정라온",
                "서서한",
                "문주호",
                "오세아",
                "이호영",
                "손윤아",
                "이동우",
                "남혜준",
                "황솔",
                "권은재",
                "곽준휘",
                "양시현",
                "김지훈",
                "신서아",
                "노도형",
                "허선",
                "노지아",
                "신아인",
                "양시은",
                "노석현",
                "손강준",
                "백주안",
                "강단우",
                "오나은",
                "오한겸",
                "백예준",
                "노은우",
                "손도헌",
                "전진우",
                "안주하",
                "백다은",
                "유민기",
                "노휘",
                "박채원",
                "강다겸",
                "신여준",
                "허은유",
                "심서후",
                "유준이",
                "전민승",
                "강예은",
                "허로이",
                "유유진",
                "권건하",
                "하도이",
                "노도원",
                "문하성",
                "오시후",
                "이로윤",
                "노지후",
                "권채이",
                "전담",
                "하태율",
                "노다율",
                "장우솔",
                "황하준"
    };
    public String[] getNames() {
        return names;
    }

    public HashMap<String, String> getMaps(){
        map.put("권하준", "https://github.com/dongyeon-0822/java-project-exercise");
        map.put("조성윤", "https://github.com/kang-subin/Java");
        map.put("안예은", "https://github.com/KoKwanwun/LikeLion.git");
        map.put("남우빈", "https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion");
        map.put("최경민", "https://github.com/cmkxak/likelion-java-course");
        map.put("안준휘", "https://github.com/rnrudejr9/CodeLion-git-test");
        map.put("하채민", "https://github.com/Qkite/java-excercise-01/tree/main/src");
        map.put("허도한", "https://github.com/lucyoz/java-exercise");
        map.put("배태훈", "https://github.com/percyfrank/like-lion");
        map.put("정해성", "https://github.com/KimGunWoo9595/Lion_Java_Pratice");
        map.put("하찬희", "https://github.com/KimKiheon/LikeLion");
        map.put("박도아", "https://github.com/kny3037/java-exercise");
        map.put("유경준", "https://github.com/KimDohyoun79/remote_Lion.git");
        map.put("고다니엘", "https://github.com/kimkimj/create-repo1");
        map.put("하이안", "https://github.com/mingry2/intellij-git-exercise1");
        map.put("고유호", "https://github.com/Min-ji99/intelliJ-git-exercies");
        map.put("전민찬", "https://github.com/sangho527/Like_Lion_Java");
        map.put("배강", "https://github.com/ReadnThink/Like_lion.git");
        map.put("유서이", "https://github.com/yejinstar/git_exercise_push");
        map.put("황도빈", "https://github.com/dmdwns2/java-git-init");
        map.put("강규진", "https://github.com/Geuun/Java_Algorithm");
        map.put("임예린", "https://github.com/O-sulloc/java-exercise-1005");
        map.put("양예온", "https://github.com/chordpli/likelion_course");
        map.put("곽윤재", "https://github.com/strongcookdas/java.git");
        map.put("한단", "https://github.com/Kim-Ji-Yeong/Java-exercise");
        map.put("박강현", "https://github.com/k0605ja/git-test");
        map.put("윤성민", "https://github.com/pigeon2gugu/like-lion-2/tree/main/src/class_221005");
        map.put("박재윤", "https://github.com/hj-k66/git_exercise_2");
        map.put("서현준", "https://github.com/moomineee/JavaEx");
        map.put("노유주", "https://github.com/sujin-park0607/java-project-exercise");
        map.put("전율", "https://github.com/joypeb/java-project-push-test");
        map.put("노아린", "https://github.com/pi22-a/git_practice.git");
        map.put("권아윤", "https://github.com/JemJem70/Algolism/tree/master/src");
        map.put("송태서", "https://github.com/BearCrying/Git_Excercise/tree/main/src");
        map.put("정라온", "https://github.com/Bae-Ji-Won/Java-Study");
        map.put("서서한", "https://github.com/geunnseung/java_exercise_intellij_push.git");
        map.put("문주호", "https://github.com/JiMandy00/Java_LikeLion");
        map.put("오세아", "JAVA-GIT-TEST/src at main · seop93/JAVA-GIT-TEST (github.com)");
        map.put("이호영", "https://github.com/sjhlko/git-exercise-java");
        map.put("손윤아", "https://github.com/tgseo76/javja-ex");
        map.put("이동우", "https://github.com/seanee3670/CodeLion/tree/master/src");
        map.put("남혜준", "https://github.com/dalddu/Intellig-git-exercise");
        map.put("황솔", "https://github.com/hyunsik96/git-exercise-java-push");
        map.put("권은재", "https://github.com/ccodding/git-exercise-java-push");
        map.put("곽준휘", "https://github.com/TaylorSwiftlove/git-exercise-java");
        map.put("양시현", "https://github.com/jinwoooooo/git-exercise-java-push");
        map.put("김지훈", "https://github.com/simhyunbo/git-exercise-04.git");
        map.put("신서아", "https://github.com/ahngiwon00/git-exercise-java-push");
        map.put("노도형", "https://github.com/ahn-ji0/java_exercise");
        map.put("허선", "https://github.com/Changbum97/like-lion-java");
        map.put("노지아", "https://github.com/SoonMinEom/LikeALion");
        map.put("신아인", "https://github.com/ohy1023/newtest");
        map.put("양시은", "https://github.com/SuInWoo/LikeLion2th");
        map.put("노석현", "https://github.com/inkyu-yoon/IntelliJ_Commit_Test");
        map.put("손강준", "https://github.com/inkyu-yoon/IntelliJ_Commit_Test");
        map.put("백주안", "https://github.com/KaNoopy/like_lion.git");
        map.put("강단우", "https://github.com/ondayary/java-init-project.git");
        map.put("오나은", "https://github.com/dohyunre702/codelion_intelliJ");
        map.put("오한겸", "https://github.com/leejoonsang/bes2");
        map.put("백예준", "https://github.com/naegonggae/lion");
        map.put("노은우", "https://github.com/Soyeong4250/IntelliJPush");
        map.put("손도헌", "https://github.com/slrkajsep337/JavaStudy");
        map.put("전진우", "https://github.com/ajin0516/java_project.git");
        map.put("안주하", "https://github.com/yjyj1023/java-Calculator2");
        map.put("백다은", "https://github.com/inkyu-yoon/IntelliJ_Commit_Test");
        map.put("유민기", "https://github.com/hyeonju01/likelion_repo3_test/tree/main/src/week3/day2");
        map.put("노휘", "https://github.com/hakjun1/intelij-git-exercise03");
        map.put("박채원", "https://github.com/jangseoyun/Intellij-git-exercise");
        map.put("강다겸", "https://github.com/Senna97/Like-Lion");
        map.put("신여준", "https://github.com/inkyu-yoon/IntelliJ_Commit_Test");
        map.put("허은유", "https://github.com/su0545/like-lion-java.git");
        map.put("심서후", "https://github.com/Nickolodeon98/second-java-exercise");
        map.put("유준이", "https://github.com/daehwan0307/JAVA_Study");
        map.put("전민승", "https://github.com/sanghee2359?tab=repositories");
        map.put("강예은", "https://github.com/wogus0518/LikeLion-Backend");
        map.put("허로이", "https://github.com/heejunns/git_exercise_push.git");
        map.put("유유진", "https://github.com/h5000n/git-java-ex211005");
        map.put("권건하", "https://github.com/mooonju/java-exercise");
        map.put("하도이", "https://github.com/coastby/java-project");
        map.put("노도원", "https://github.com/Yunjaejo/new-project-push-test");
        map.put("문하성", "https://github.com/Combi153/BackEndSchool2");
        map.put("오시후", "https://github.com/chlalswns200/java_push");
        map.put("이로윤", "https://github.com/S2uJeong/git-exercise-java");
        map.put("노지후", "https://github.com/gemdoq/exercise");
        map.put("권채이", "https://github.com/surpmh/intellij-git-exercise");
        map.put("전담", "https://github.com/sandee-han/java-project-push-exercise");
        map.put("하태율", "https://github.com/JinDDung2/java-project/tree/main");
        map.put("노다율", "https://github.com/menuhwang/LikeLion");
        map.put("장우솔", "https://github.com/cvivis/git_practice2022/tree/main");
        map.put("황하준", "https://github.com/lay423/java-project");
        return map;
    }
}
