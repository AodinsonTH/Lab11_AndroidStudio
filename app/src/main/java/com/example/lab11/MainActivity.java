package com.example.lab11;

import android.os.Bundle;
import com.example.lab11.databinding.ActivityMainBinding;
import com.example.lab11.model.MyChat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountedCompleter;

import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    //private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ActivityMainBinding binding;
    private RecyclerView.Adapter<MyAdapter.ViewHolder> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); // Inflate binding
        setContentView(binding.getRoot());

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        List<MyChat> myChats = new ArrayList<MyChat>();
        MyChat myChat = new MyChat();
        myChat.setFriend_name("แชทเอิร์ธ");
        myChat.setFriend_image("https://scontent.fubp1-1.fna.fbcdn.net/v/t39.30808-6/449486536_3678757255771410_6462913560605724152_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=VqT8TUVma04Q7kNvgGvYqDU&_nc_ht=scontent.fubp1-1.fna&oh=00_AYCmWxjaLRg7xq0Pyv5nZL5LSDm6mDwa3jzxj8mJqfslpg&oe=66DF85CA");
        myChat.setFriend_phone_number("0911111111");
        myChat.setFriend_address("112 UBON TH");
        myChat.setFriend_stdid("66114540001");
        myChat.setFriend_dob("2 Nov 2004");
        myChats.add(myChat);

        MyChat myChat2 = new MyChat();
        myChat2.setFriend_name("ท็อปเทพ");
        myChat2.setFriend_image("https://scontent.fubp1-1.fna.fbcdn.net/v/t39.30808-1/287683046_1895254330671511_214945431124752755_n.jpg?stp=dst-jpg_s200x200&_nc_cat=106&ccb=1-7&_nc_sid=0ecb9b&_nc_ohc=QpS9k7MGnigQ7kNvgFiy79K&_nc_ht=scontent.fubp1-1.fna&oh=00_AYDrGv67DdAmPZJC5iSQLFsZTdHMP7H1AYjeMs_vFI2yYw&oe=66DF6E81");
        myChat2.setFriend_phone_number("0922222222");
        myChat2.setFriend_address("85/1 UBU");
        myChat2.setFriend_stdid("66114540002");
        myChat2.setFriend_dob("18 Jul 2004");
        myChats.add(myChat2);


        MyChat myChat3 = new MyChat();
        myChat3.setFriend_name("ริกกี้");
        myChat3.setFriend_image("https://scontent.fubp1-1.fna.fbcdn.net/v/t39.30808-6/285445895_3387187324942205_8153063479638077213_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=a5f93a&_nc_ohc=upYMfK2RSfEQ7kNvgFzpb5l&_nc_ht=scontent.fubp1-1.fna&oh=00_AYBJqebr3fou5oQl8xX8l8JVSh5K9_iQcL2-nHN-OBx2Nw&oe=66DF8A9F");
        myChat3.setFriend_phone_number("0933333333");
        myChat3.setFriend_address("154 UBON TH");
        myChat3.setFriend_stdid("66114540003");
        myChat3.setFriend_dob("6 Apr 2004");
        myChats.add(myChat3);


        MyChat myChat4 = new MyChat();
        myChat4.setFriend_name("ออฟ ปองกูล");
        myChat4.setFriend_image("https://scontent.fubp1-1.fna.fbcdn.net/v/t1.30497-1/453178253_471506465671661_2781666950760530985_n.png?stp=dst-png_s200x200&_nc_cat=1&ccb=1-7&_nc_sid=136b72&_nc_ohc=VVXDQ2ftWTsQ7kNvgEZknKV&_nc_ht=scontent.fubp1-1.fna&oh=00_AYAUMNGWTVH64E6XXpSE3exQS60iUXBFEa8-eDTC8bdIWw&oe=6700FEBA");
        myChat4.setFriend_phone_number("0944444444");
        myChat4.setFriend_address("114/1 UBON TH");
        myChat4.setFriend_stdid("66114540004");
        myChat4.setFriend_dob("10 Sep 2004");
        myChats.add(myChat4);



        MyChat myChat5 = new MyChat();
        myChat5.setFriend_name("บอมบู้บี้");
        myChat5.setFriend_image("https://scontent.fubp1-1.fna.fbcdn.net/v/t39.30808-1/431967715_1459940458265144_4992858417430823033_n.jpg?stp=dst-jpg_s200x200&_nc_cat=100&ccb=1-7&_nc_sid=0ecb9b&_nc_ohc=4F-ENGFGFq0Q7kNvgGsnv6O&_nc_ht=scontent.fubp1-1.fna&oh=00_AYDmFLgIiHBMiehn5UUEd8v-kTdOhXX-8LFvVyq_lvggWg&oe=66DF7246");
        myChat5.setFriend_phone_number("0955555555");
        myChat5.setFriend_address("159 UON TH");
        myChat5.setFriend_stdid("66114540005");
        myChat5.setFriend_dob("22 Sep 2004");
        myChats.add(myChat5);


        MyChat myChat6 = new MyChat();
        myChat6.setFriend_name("บอลลี่ บอลลี่");
        myChat6.setFriend_image("https://scontent.fubp1-1.fna.fbcdn.net/v/t39.30808-6/457636631_1048150900313014_2525210631863264700_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=yFk3c1cG7O4Q7kNvgESCuqs&_nc_ht=scontent.fubp1-1.fna&oh=00_AYCJ_qNSZGrOSq97dmpj8JHhRWOOG_D1HL3D8l3Sa3CWZQ&oe=66DF7B3D");
        myChat6.setFriend_phone_number("0966666666");
        myChat6.setFriend_address("14/1 UBON TH");
        myChat6.setFriend_stdid("66114540006");
        myChat6.setFriend_dob("10 Jan 2004");
        myChats.add(myChat6);


        mAdapter = new MyAdapter(myChats, this);
        recyclerView.setAdapter(mAdapter);


    }
}