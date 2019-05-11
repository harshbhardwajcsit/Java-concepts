import com.sun.javafx.collections.ImmutableObservableList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.lang.System.setOut;
import static java.util.stream.Collectors.toList;

public class StreamAPI {
    public static void main(String args[]) {
//        findFirst();
        peek1();

    }

    public static void peek() {
        Stream.of("one", "two", "three", "four")
                .filter(val -> val.length() > 3)
                .peek(val -> out.println("filtered " + val))
                .map(String::toUpperCase)
                .peek(val -> out.println("new values" + val))
                .collect(toList());
    }

    public static void sort() {
        Stream.of("d", "e", "b", "a")
                .sorted()
                .peek(out::println)
                .collect(toList());
    }

    public static void distinct() {
        Stream.of("d", "e", "b", "d")
                .distinct()
                .peek(out::println)
                .collect(toList());
    }

    public static void count() {
        out.println(Stream.of("d", "e", "b", "d", "e", "e")
                .filter(val -> val == "e")
                .count());
    }

    public static void extendedFilter() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 0)
                .map(StreamAPI::getSquare)
                .peek(out::println)
                .collect(toList());
    }

    public static int getSquare(int a) {
        return a * a;
    }


    public static void reduce() {

        Optional<String> string = Stream.of("abc", "abcd", "abcde")
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);

    }

    public static void peek1() {
        Optional<String> s = Stream.of("one", "two", "three", "four")
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);

        if(s.isPresent()){
            System.out.println(s.get());
        }
    }

    private static Boolean isNumberIdOdd(int number) {
        return number % 2 == 0;
    }

    public static void isOdd() {
        Stream.of(2, 3, 4, 5)
                .map(StreamAPI::isNumberIdOdd)
                .forEach(out::print);
    }

//    public static void findFirst() {
//
//        Campaign campaign1 = new Campaign();
//        String s;
//        campaign1.setActive(Boolean.TRUE);
//
//        Participant participant1 = new Participant();
//        participant1.campaignCode = 1;
//        participant1.customerProfile = 1;
//
//        Participant participant2 = new Participant();
//        participant2.campaignCode = 2;
//        participant2.customerProfile = 2;
//
//        ImmutableObservableList<Participant> participantsList1 = new ImmutableObservableList<>();
//        participantsList1.addAll(participant1, participant2);
//        campaign1.setParticipants(participantsList1);
//
//        Campaign campaign2 = new Campaign();
//
//        campaign2.setActive(Boolean.TRUE);
//
//        Participant participant3 = new Participant();
//        participant3.campaignCode = 1;
//        participant3.customerProfile = 1;
//
//        Participant participant4 = new Participant();
//        participant4.campaignCode = 2;
//        participant4.customerProfile = 2;
//
//        ImmutableObservableList<Participant> participantsList2 = new ImmutableObservableList<>();
//        participantsList2.addAll(participant3, participant4);
//        campaign1.setParticipants(participantsList2);
//
//        ImmutableObservableList<Campaign> campaigns = new ImmutableObservableList<>();
//        campaigns.addAll(campaign1, campaign2);
//
//
//        List<Integer> customerProfiles = new ArrayList<>();
//        for (Campaign c : campaigns) {
//            if (c.getActive()) {
//                for (Participant p : c.getParticipants()) {
//                    if (p.getCampaignCode() == 1) {
//                        customerProfiles.add(p.getCustomerProfile());
//                    }
//                }
//            }
//        }
//
//        customerProfiles = campaigns.stream()
//                .filter(campaign -> campaign.isActive)
//                .map(campaign -> campaign.getParticipants())
//                .filter(participant -> {
//                    return participant.getCampaignCode() == 1;
//                })
//                .map(participant -> {
//                    return participant.getCustomerProfile();
//                })
//                .sorted(Comparator.comparing(
//                        customerProfile -> customerProfile.getName()))
//                .collect(Collectors.toList());
//
//
//    }




    class Campaign {
        public Boolean getActive() {
            return isActive;
        }

        public void setActive(Boolean active) {
            isActive = active;
        }

        public List<Participant> getParticipants() {
            return participants;
        }

        public void setParticipants(List<Participant> participants) {
            this.participants = participants;
        }

        public Boolean isActive;
        public List<Participant> participants;
    }

    public class Participant {
        public int getCampaignCode() {
            return campaignCode;
        }

        public void setCampaignCode(int campaignCode) {
            this.campaignCode = campaignCode;
        }

        public int getCustomerProfile() {
            return customerProfile;
        }

        public void setCustomerProfile(int customerProfile) {
            this.customerProfile = customerProfile;
        }

        public int campaignCode;
        public int customerProfile;
    }
}