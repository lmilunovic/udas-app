package com.example.udasapp;

import com.example.udasapp.data.*;
import com.example.udasapp.model.Gender;
import com.example.udasapp.model.OrganisationMember;
import com.example.udasapp.model.address.City;
import com.example.udasapp.model.disability.*;
import com.example.udasapp.model.social.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UdasAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdasAppApplication.class, args);
    }


    // TODO set only for dev profile
    @Bean
    public CommandLineRunner dataLoader(
            OrganizationMemberRepository memberRepo
            , CityRepository cityRepo
            , ProfessionRepository professionRepo
            , HousingSituationRepository housingSituationRepo
            , EmploymentStatusRepository employmentStatusRepo
            , MaritalStatusRepository maritalStatusRepo
            , EducationLevelRepository educationLevelRepo
            , InjuredBodyPartRepository injuredBodyPartRepo
            , InjuryCauseRepository injuryCauseRepo
            , InjuryRepository injuryRepo
            , DisabilityCategoryRepository disabilityCategoryRepo
            , DisabilityStatusRepository disabilityStatusRepo
    ) {

        return args -> {

            City banjaLuka = new City("Banja Luka");
            City kozarskaDubica = new City("Kozarska Dubica");
            City prijedor = new City("Prijedor");
            City gradiska = new City("Gradiška");
            City laktasi = new City("Laktaši");
            City trebinje = new City("Trebinje");

            cityRepo.saveAll(List.of(banjaLuka, kozarskaDubica, prijedor, gradiska, laktasi, trebinje));

            Profession autoMehanicar = new Profession("Automehanicar");
            Profession profesor = new Profession("Profesor");
            Profession nastavnik = new Profession("Nastavnik");
            Profession stolar = new Profession("Stolar");
            Profession stomatolog = new Profession("Stomatolog");
            Profession nepoznataProfesija = new Profession("Nepoznato");

            professionRepo.saveAll(List.of(autoMehanicar, profesor, nastavnik, stolar, stomatolog, nepoznataProfesija));

            HousingSituation uRoditeljskojKuci = new HousingSituation("U roditeljskoj kuci");
            HousingSituation vlastitiObjekat = new HousingSituation("Vlastiti objekat");
            HousingSituation podstanar = new HousingSituation("Podstanar");
            HousingSituation podHipotekom = new HousingSituation("Objekat pod hipotekom");
            HousingSituation bezMjestaStanovanja = new HousingSituation("Bez mjesta stanovanja");
            HousingSituation nepoznataSituacija = new HousingSituation("Nepoznato");

            housingSituationRepo.saveAll(List.of(uRoditeljskojKuci, vlastitiObjekat, podstanar, podHipotekom, bezMjestaStanovanja, nepoznataSituacija));

            EmploymentStatus zaposlen = new EmploymentStatus("Zaposlen/a");
            EmploymentStatus nezaposlen = new EmploymentStatus("Nezaposlen/a");
            EmploymentStatus penzionisan = new EmploymentStatus("Penzionisan/a");
            EmploymentStatus nepoznatoZaposlenje = new EmploymentStatus("Nepoznato");

            employmentStatusRepo.saveAll(List.of(zaposlen, nezaposlen, penzionisan, nepoznatoZaposlenje));

            MaritalStatus uBraku = new MaritalStatus("U braku");
            MaritalStatus razveden = new MaritalStatus("Razveden/a");
            MaritalStatus udovac = new MaritalStatus("Udovac/Udovica");
            MaritalStatus neozenjen = new MaritalStatus("Neoženjen/Neudata");
            MaritalStatus nepoznatBracniStatus = new MaritalStatus("Nepoznato");

            maritalStatusRepo.saveAll(List.of(uBraku, razveden, udovac, neozenjen, nepoznatBracniStatus));

            EducationLevel nkv = new EducationLevel("NKV");
            EducationLevel nss = new EducationLevel("NSS");
            EducationLevel sss = new EducationLevel("SSS");
            EducationLevel vkv = new EducationLevel("VKV");
            EducationLevel kv = new EducationLevel("KV");
            EducationLevel pkv = new EducationLevel("PKV");
            EducationLevel vss = new EducationLevel("VSS");
            EducationLevel vshs = new EducationLevel("VŠS");
            EducationLevel nepoznatNivo = new EducationLevel("Nepoznato");

            educationLevelRepo.saveAll(List.of(nkv, nss, sss, vkv,kv,pkv,vss,vshs, nepoznatNivo));

            InjuredBodyPart ruka = new InjuredBodyPart("Ruka");
            InjuredBodyPart noga = new InjuredBodyPart("Noga");
            InjuredBodyPart uho = new InjuredBodyPart("Uho");
            InjuredBodyPart oko = new InjuredBodyPart("Oko");
            InjuredBodyPart glava = new InjuredBodyPart("Glava");
            InjuredBodyPart nepoznato = new InjuredBodyPart("Nepoznato");

            injuredBodyPartRepo.saveAll(List.of(ruka, noga, uho, oko, glava, nepoznato));

            InjuryCause granata = new InjuryCause("Granata");
            InjuryCause mina = new InjuryCause("Mina");
            InjuryCause nus = new InjuryCause("NUS");
            InjuryCause metak = new InjuryCause("Metak");
            InjuryCause nesreca = new InjuryCause("Nesreća");
            InjuryCause bolest = new InjuryCause("Bolest");
            InjuryCause urodjeno = new InjuryCause("Urođeno");
            InjuryCause nepoznatUzrok = new InjuryCause("Nepoznato");

            injuryCauseRepo.saveAll(List.of(granata, mina, nus, metak, nesreca, bolest, urodjeno, nepoznatUzrok));

            Injury injury = new Injury(
                    "Amputacija lijeve ruke i lijevog stopala",
                    granata,
                    List.of(ruka, noga)
            );

            injuryRepo.save(injury);

            DisabilityCategory first = new DisabilityCategory("I");
            DisabilityCategory second = new DisabilityCategory("II");
            DisabilityCategory third = new DisabilityCategory("III");
            DisabilityCategory fourth = new DisabilityCategory("IV");
            DisabilityCategory fifth = new DisabilityCategory("V");
            DisabilityCategory sixth = new DisabilityCategory("VI");
            DisabilityCategory seventh = new DisabilityCategory("VII");
            DisabilityCategory eight = new DisabilityCategory("VIII");
            DisabilityCategory ninth = new DisabilityCategory("IX");
            DisabilityCategory tenth = new DisabilityCategory("X");
            DisabilityCategory unknown = new DisabilityCategory("Unknown");

            disabilityCategoryRepo.saveAll(List.of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, unknown));

            DisabilityStatus rvi = new DisabilityStatus("RVI");
            DisabilityStatus czr = new DisabilityStatus("CŽR");
            DisabilityStatus nepoznatStatus = new DisabilityStatus("Nepoznato");

            disabilityStatusRepo.saveAll(List.of(rvi, czr, nepoznatStatus));

            OrganisationMember member = new OrganisationMember(
                    1L,
                    "Nikola",
                    "Nikolić",
                    Gender.MALE,
                    "1234567891234",
                    null,
                    null,
                    banjaLuka,
                    "Kralja Alfonsa",
                    "13",
                    List.of("00000000", "00000000"),
                    List.of("nikola.nikolic@gmail.com"),
                    nkv,
                    autoMehanicar,
                    zaposlen,
                    uBraku,
                    uRoditeljskojKuci,
                    "Živi sa roditeljima",
                    List.of(injury),
                    first,
                    rvi,
                    1.0,
                    true,
                    "Neke osnovne informacije o članu"
            );

            memberRepo.save(member);
        };
    }

}
