package com.example.tourism;

import com.example.tourism.adapters.HangoutItem;

import java.util.ArrayList;

class FunFactItem {
    String funfactinfo;
    int FunFactImage;

    FunFactItem(String info, int image) {
        this.funfactinfo = info;
        this.FunFactImage = image;
    }
}

class CityItem {
    int cityid;
    String cityname;
    String description;
    String cityweather;
    String cityweatherdescription;
    int cityHumidity;
    int cityimage;
    double cityLatitude;
    double cityLongitude;
    ArrayList<FunFactItem> funfacts;
    ArrayList<HangoutItem> hangoutItemArrayList;
    ArrayList<HangoutItem> restuarentsItemArrayList;
    ArrayList<HangoutItem> shoppingItemArrayList;
    ArrayList<HangoutItem> monumentsItemArrayList;

    public CityItem(
            int cityid,
            String cityname,
            String description,
            String cityweather,
            String cityweatherdescription,
            int cityHumidity,
            int cityimage,
            double cityLatitude,
            double cityLongitude,
            ArrayList<FunFactItem> funfacts,
            ArrayList<HangoutItem> hangoutItemArrayList,
            ArrayList<HangoutItem> restuarentsItemArrayList,
            ArrayList<HangoutItem> shoppingItemArrayList, ArrayList<HangoutItem> monumentsItemArrayList) {
        this.cityid = cityid;
        this.cityname = cityname;
        this.description = description;
        this.cityweather = cityweather;
        this.cityweatherdescription = cityweatherdescription;
        this.cityHumidity = cityHumidity;
        this.cityimage = cityimage;
        this.cityLatitude = cityLatitude;
        this.cityLongitude = cityLongitude;
        this.funfacts = funfacts;
        this.hangoutItemArrayList = hangoutItemArrayList;
        this.restuarentsItemArrayList = restuarentsItemArrayList;
        this.shoppingItemArrayList = shoppingItemArrayList;
        this.monumentsItemArrayList = monumentsItemArrayList;
    }
}

public class CitiesData {
    static ArrayList<CityItem> cities = new ArrayList<CityItem>();

    public void addcityitem(int cityid,
                            String cityname,
                            String description,
                            String cityweather,
                            String cityweatherdescription,
                            int cityHumidity,
                            int cityimage,
                            double cityLatitude,
                            double cityLongitude,
                            ArrayList<FunFactItem> funfacts,
                            ArrayList<HangoutItem> hangoutItemArrayList,
                            ArrayList<HangoutItem> restuarentsItemArrayList,
                            ArrayList<HangoutItem> shoppingItemArrayList,
                            ArrayList<HangoutItem> monumentsItemArrayList
    ) {
        CityItem newCity = new CityItem(cityid, cityname, description, cityweather, cityweatherdescription, cityHumidity, cityimage, cityLatitude, cityLongitude, funfacts, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
        cities.add(newCity);
    }

    public void addcity() {
        addmumbai();
        addelhi();
        addbangalore();
        addchennai();
        addhyderabad();
        addkolkata();
        addvishakhapatnam();
        addjaipur();
        addnagpur();
        addsurat();
    }

    public CityItem getCity(int id) {
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).cityid == id) {
                return cities.get(i);
            }
        }
        return null;
    }

    public void addmumbai() {
        ArrayList<FunFactItem> funfactsMumbai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsMumbai.add(new FunFactItem("India’s first ever train ran between Mumbai and Thane. On 16 April 1853, India’s first train commenced its operation. Mumbai Locals are the busiest railways in the world and carry about 2.2 billion passengers every year. Mumbai also has the most obsolete electric rail chain in India, which was installed in 1925."
                , R.drawable.mumbai3));
        funfactsMumbai.add(new FunFactItem("Mumbai was the first one to start a bus service in India. It was on 15 July 1926, that the first ever bus service in India was started. The first route was ridden between Afghan Church and Crawford Market."
                , R.drawable.mumbai4));
        funfactsMumbai.add(new FunFactItem(" World’s most expensive house is in Mumbai Antilia, Mukesh Ambani’s 27-story skyscraper is cited as the world’s most expensive house, valued at almost $1 billion. The business tycoon moved into the 400,000 square feet mansion in 2012 with his wife and three children."
                , R.drawable.mumbai5));

        //Marine Drive
        hangoutItemArrayList.add(new HangoutItem(R.drawable.marinedrive, "Marine Drive", "3.6-kilometre-long Promenad",
                "Marine Drive linking Nariman Point to Babulnath is a major landmark within the borders of Mumbai tourist spots. It has a string of sparkling lights adorning the town just like a “Queen’s Necklace”. The boulevard is about 3 km long, with the Girgaum Chowpatty beach at the north end and it is one among the perfect hangout places in Mumbai for friends.",
                18.941482, 72.823679));
        //Chowpatty
        hangoutItemArrayList.add(new HangoutItem(R.drawable.chowpatty, "Chowpatty", "Beach",
                "A popular locality in South Mumbai, Girgaum Chowpatty beach is situated in northern end of Marine Drive curving round the coast. The place is bustling with activity in the evenings and is popular for its snack stalls that are available at evenings. With people flocking to satisfy their hunger pangs, this place receives a heavy footfall every single day.",
                18.9542624, 72.8077065));
        //Juhu
        hangoutItemArrayList.add(new HangoutItem(R.drawable.juhu, "Juhu", "Home to many celebrities",
                "Juhu is home to many celebrities, and therefore the beach features a carnival-like atmosphere during the year. Balloon stalls, kites, sand sculptures, rides, horse rides, stalls selling food to jewelry are often found here. Unarguably, the simplest place to hold out with friends in Mumbai, a couple of hours spent here will remain etched in the memories forever.",
                19.1012636, 72.8120343));
        //Sanjay Gandhi National Park
        hangoutItemArrayList.add(new HangoutItem(R.drawable.sgnp, "Sanjay Gandhi National Park", "National Park",
                "Sanjay Gandhi Park is frequented by many early morning fitness enthusiasts and picnickers. There are a number of attractions just like the wildlife safari, toy train, trekking, a ship ride on the lake and hand-carved Kanheri Buddhist caves, scattered over the hilltop. Each cave has been carved out of igneous rock and has towering, impactful sculptures of Buddha",
                19.2288092, 72.9159897));
        //Smaaash
        hangoutItemArrayList.add(new HangoutItem(R.drawable.smash, "Smaaash", "Fun Spot",
                "There are a variety of games for all age groups including bumper cars, air hockey, football and even a restaurant that serves a wide range of kid-friendly food items. They even have go-karting. Kids love coming here because it is one among the foremost fun spots.",
                19.1008235, 72.7832565));
        //Snow World
        hangoutItemArrayList.add(new HangoutItem(R.drawable.snowworld, "Snow World", "Theme Park",
                "This one among many major theme parks in Mumbai happens to be a big hit with the youngsters of the city because it offers them the experience of playing in snow and also trying out some fun rides. A number of the activities include snowboarding, skating, ice sliding and much more are available here and one can enjoy the pleasures of the snow without having to leave the city.",
                19.0863795, 72.8867887));

        //Namak - Indian Specialty Restaurant
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.namak, "Namak - Indian Specialty Restaurant", "North India Cuisine",
                "Namak is one of the many dining options available at Sahara Star Hotel. As the name suggests, this restaurant serves Indian cuisine with dishes from all over the country. Primarily focuses on North Indian food. The restaurant overlooks the garden area, they have open kitchen where you can see chefs whizzing about preparing your meal. The decor is as simple as its name and is made up of earthy tones."
                , 19.0948346, 72.8533786));
        //Peshwa Pavilion
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.peshwapavilion, "Peshwa Pavilion", "ITC Hotel",
                "Indian, Pan Asian and European fare is what one can look forward to here. From artisan pasta to hot pressed sandwiches and wraps to local favourites like Bohri khichda and Murg Cha Rassa, this menu boasts of it all. There are ample healthy options as well. The bar menu offers tremendous variety. Apart from the comprehensive À la carte menu, the lavish buffets for breakfast, lunch and dinner are hugely popular. The food is aesthetically presented and the portions generous."
                , 19.1039406, 72.8674359));
        //Dakshin Coastal
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.dakshincoastal, "Dakshin Coastal", "South India Cuisine",
                "The Dakshin Coastal, a re-tweaking of the original concept, marks an improvement but I don't think it goes far enough.That said, the food, drawn from the Southern states, can be excellent. Individual dishes, such as the pandi curry from Coorg or the spicy Andhra biryani are well-executed and it is hard to eat badly here. Even the room has a certain functional elegance and the service is good."
                , 19.1039676, 72.867744));
        //Fenix
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.fenix, "Fenix, The Oberoi", "All Cuisines",
                "Indian classics sit alongside pan Asian favourites, Japanese sushi and Western dishes. International beverages menu includes Japanese sake and whisky, fine wines and more. Carefully selected to complement the cuisines. All topped off with an Oberoi signature and served with intuitive attention to customer needs; making breakfast, lunch or dinner here a memorable experience."
                , 18.9274871, 72.8185613));
        //Lake View Cafe
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.lakeviewcafe, "Lake View Cafe", "All Cuisines",
                "This all-day dining place in its bright new avatar, with an al fresco section, is a treat for the eyes and a far cry from the staid place it was. The décor is smart and contemporary and the vibe, unmistakably warm and inviting. The layout is pleasing and the seating areas well-spread out. From 'Nasik Tomato Soup' to 'Saoji Mutton' and 'Prawns Linguine' to 'Brie Tempura', the exhaustive a la carte menu entices you with myriad offerings across cuisines. There are classics, Indian dishes, small plates, large plates and desserts."
                , 19.1344265, 72.8992225));
        //Tanatan
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mumbai6, "Tanatan", "Vegan Cuisine",
                "An upscale resto-bar in the affluent suburb of Juhu, Mumbai has made its way to Shivaji Park, Dadar. Tanatan has redefined the dining experience serving avant-garde quality of food and drinks."
                , 19.1092351, 72.8233233));

        //Colaba Causeway
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai11, "Colaba Causeway", "Colaba Causeway, South Mumbai.",
                "The everyday carnival of the Colaba Causeway market is a shopping experience like no other in Mumbai. Geared especially towards tourists, that infamous Indian saying of sab kuch milega (everything is possible) certainly applies at this market.",
                18.9246004, 72.8298892));
        //Chor Bazaar
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai12, "Chor Bazaar", "Mohammad Ali Road, South Mumbai.",
                "Chor Bazaar is one of the largest flea markets in India, located near Bhendi Bazaar in Grant Road, South Mumbai. The area is one of the tourist attractions of Mumbai.",
                18.959993, 72.8224786));
        //Linking Road
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai13, "Linking Road", "Linking Road, Bandra West",
                "A fusion of modern and traditional, and East meets West, in one of Mumbai's hippest suburbs. Here streets stalls contrast with brand name shops, and you'll find a local Indian roadside food vendor on one side of the road",
                19.0746968, 72.8320184));
        //Dharavi Leather Market
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai14, "Dharavi Leather Market", "Sion-Bandra Link Road",
                "A lot of people automatically associate Mumbai's notorious Dharavi slum with poverty and misery. However, this is actually very ignorant and insulting.While the conditions are poor, Dharavi is in fact home to many flourishing small-scale industries.",
                19.0403538, 72.8452235));
        //Phoenix Marketcity
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai15, "Phoenix Marketcity", "Kurla West",
                "Retail complex with brand-name stores, restaurants & a cinema, plus extravagant, seasonal displays.",
                19.0403503, 72.8189587));
        //Palladium
        shoppingItemArrayList.add(new HangoutItem(R.drawable.palladiummall, "Palladium", "Senapati Bapat Marg, Lower Parel, Mumbai",
                "Palladium Mall houses a number of luxury labels, high fashion brands, cafes, bookstores, fine dining restaurants, a stand-up comedy venue and spas & salons among others. They also offer special services such as VIP lounges, extended shopping hours, a concierge desk, and valet parking to all visitors.",
                18.9939995, 72.8233228));

        //Gateway of India
        monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai16, "Gateway of India", "South Mumbai’s Apollo Bunder road",
                "Grand, Indo-Saracenic-style, 26m-tall triumphal stone arch, built on the waterfront in 1924.",
                18.9219841, 72.8324656));
        //August Kranti Maidan
        monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai17, "August Kranti Maidan", "Tardeo",
                "Mumbai’s August Kranti Maidan is one of the most significant historic chapters in India’s journey of the independence struggle. This is where Mahatma Gandhi commanded the British to leave India on August 8, 1942.",
                18.9622943, 72.8101406));
        //Rajabai Clock Tower
        monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai18, "Rajabai Clock Tower", "Karmaveer Bhaurao Patil Marg, Mantralaya, Fort, Mumbai,",
                "The Rajabai Tower is a clock tower in South Mumbai India. It is in the confines of the Fort campus of the University of Mumbai. It stands at a height of 85 m.",
                18.9297669, 72.8278943));
        //Town Hall
        monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai19, "Town Hall", "Shahid Bhagat Singh Marg,Mumbai",
                "The Asiatic Society of Mumbai Town Hall or Town Hall Mumbai is a Neoclassical building located in the Fort locality of South Mumbai.",
                18.9297669, 72.830083));
        //Chhatrapati Shivaji Maharaj Vastu Sangrahalaya
        monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai20, "Chhatrapati Shivaji Maharaj Vastu Sangrahalaya", "Mahatma Gandhi Road, Kala Ghoda, Fort, Mumbai",
                "The Chhatrapati Shivaji Maharaj Vastu Sangrahalaya is an iconic museum the construction of which began in 1905, based on local 15th and 16th century Gujarati architecture. Known earlier as the Prince of Wales Museum.",
                18.9269015, 72.8305029));
        //Chhatrapati Shivaji Terminus
        monumentsItemArrayList.add(new HangoutItem(R.drawable.cstmumbai, "Chhatrapati Shivaji Terminus", "Chhatrapati Shivaji Terminus Area, Fort, Mumbai",
                "Planned originally as the office of the Great Indian Peninsula Railways, and now functioning as the Central Railways headquarters, Chhatrapati Shivaji Terminus or CST - formerly Victoria Terminus is a UNESCO World Heritage Site and one of India’s finest and oldest Victorian-Italianate-Gothic style architectural buildings.",
                18.941037, 72.8243669));

        addcityitem(R.drawable.mumbai, "Mumbai", "Mumbai (formerly called Bombay) is a densely populated city on India’s west coast. A financial center, it's India's largest city.  The city's also famous as the heart of the Bollywood film industry.",
                "25 C", "clear Sky", 93, R.drawable.mumbai2,
                19.0825223, 72.7410985
                , funfactsMumbai, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addelhi() {
        ArrayList<FunFactItem> funfactsDelhi = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsDelhi.add(new FunFactItem("The Red Fort use to be white in colour. You heard it right, the magnificent Red Fort which defines the almightiness of Delhi, used to be white initially. According to a survey conducted for archaeology, related research unravelled that the Fort was made up of limestone and when the stone started to wither away, the British painted it Red to preserve it."
                , R.drawable.delhi3));
        funfactsDelhi.add(new FunFactItem("The Delhi Transport Corporation along with other public transport services in Delhi is entirely run on Compressed Natural Gas (CNG)."
                , R.drawable.delhi4));
        funfactsDelhi.add(new FunFactItem("Delhi is the second most bird-rich capital in the world."
                , R.drawable.delhi5));

        //Moti Bagh – Rock Climbing At IMF
        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi6, "Moti Bagh – Rock Climbing At IMF", "Nature Hotspot",
                "Bored with films, food, and coffee? Then head to one of the most fun places in Delhi – the Indian Mountaineering Foundation! Famous for adventurous and fun activities in Delhi, the sport climbing wall should definitely not be missed! Among the adventure places in Delhi, it has anything and everything you would want to do on a ‘fun’tastic day out. It is one of the most fun places to go in Delhi."
                , 28.582346, 77.1600783));
        //Nehru Planetarium – Travel To Space
        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi7, "Nehru Planetarium – Travel To Space", "Planetarium",
                "A popular picnic spot in Delhi amongst school kids, Nehru Planetarium is sure to charm you if you are an astronomical fan! Spend the afternoon escaping into the galaxy far far away at the Nehru Planetarium. Be charmed by the stars, planets and the solar systems in the sky show as you visit one of the most interesting and fun places in Delhi for an amazing day out."
                , 28.6037965, 77.1959036));
        //Modern Art Gallery
        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi8, "Modern Art Gallery", "Gallery",
                "Museums are a passé but this modern gallery is not! Spend a day exploring not just the fantastic locations but also the breathtaking art that the city has at its disposal. A trip to NGMA, one of the most unique and fun places to visit in Delhi will surprise you with the amazing collection of paintings and sculptures."
                , 28.6037953, 77.1805827));
        //Nizamuddin Lane
        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi9, "Nizamuddin Lane", "Qawwali",
                "Fancy unique experiences in the capital city? Drop the idea of a jazz bar and instead spend an evening listening to the mystic Sufi Qawwali at the Hazrat Nizamuddin Dargah, one of the best places to visit in Delhi with friends and family. The soulful experience here is simply unforgettable!"
                , 28.5909022, 77.2427474));
        //Paranthe Wali Gali
        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi10, "Paranthe Wali Gali", "Food Hotspot",
                "There’s a saying that goes something like this: some of us love to eat, while others live to eat. If you’re of the latter type, we suggest you make a beeline for Paranthe Wali Gali. It is a very narrow street that is lined with world-class eateries selling a range of paranthas. These paranthas are topped with dollops of butter and eating them will make your day."
                , 28.6560677, 77.2283697));
        //Bahai(Lotus) Temple
        hangoutItemArrayList.add(new HangoutItem(R.drawable.lotustemple, "Bahai(Lotus) Temple", "Religion Place",
                "The Lotus Temple is among the famous tourist places in Delhi and a major landmark of India that has been attracting tourists from all over the world because of its architecture and beauty. The construction of the temple was finished in 1986. It resembles the lotus flower but created in white colour. The Lotus Temple is open to all people, regardless of region and caste.",
                28.553492, 77.2566377));

        //Berco's
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi11, "Berco's", "Chinese, Thai",
                "Known throughout the Delhi-NCR area for its Chinese and Thai offerings, Berco's is one of the best restaurants in Delhi perfect for a family lunch or dinner.",
                28.6319631, 77.2215128));
        //Olive Bar & Kitchen
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi12, "Olive Bar & Kitchen", "Italian",
                "Known throughout the Delhi-NCR area for its Chinese and Thai offerings, Berco's is one of the best restaurants in Delhi perfect for a family lunch or dinner",
                31.3061651, 75.5764861));
        //Farzi Cafe
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi13, "Farzi Cafe", "Modern IndianMexican",
                "Known for their attractive presentation of fusion dishes and a very well-organized bar, this place has a lot to give you when it comes to flavors and quality. All of their dishes are prepared with dedication, which can be seen in the attention that they pay to every small detail of a dish.",
                28.5906035, 77.1426215));
        //Jamun
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi14, "Jamun", "Light BitesCoffee",
                "Nothing can beat the surreal ambiance and interior of Jamun, you'll be pleased by their commitment to the food they cater too. In a sea of new places, Jamun has definitely stood out with its original concept and exquisite meals.",
                28.5905598, 77.1426213));
        //Beeryani
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi15, "Beeryani", "BiryaniNorth Indian",
                "Mamagoto, a famed restaurant for its unique Pan-Asian, this place is good for those who love trying out the exclusive flavor of Asian Cuisines. A very eclectic place with walls decorated with Asian ninjas, yellow striped tigers, sea blue, imperial yellows, radiant reds, and celadon greens",
                28.5466883, 77.1944392));
        //Shang Palace
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.shangpalace, "Shang Palace", "Sichuan, Cantonese and Yunnan Cuisine",
                "With expansive interiors that include lavish indoor seating and three private dining rooms, Shang Palace offers authentic Sichuan, Cantonese and Yunnan cuisine with a wide selection of vegetarian and non-vegetarian signature dishes, including signature Beijing roast duck.",
                28.62096, 77.2159733));

        //Chandni Chowk
        shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi16, "Chandni Chowk", "Near Old Delhi Railway Station, Delhi",
                "This is an ancient shopping region of Delhi, thriving until date. Enjoying this market region is like a small adventure tours. There are alleys and narrow passages, which lead to endless stream of shops.",
                28.6513744, 77.2228826));
        //Sarojini Market
        shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi17, "Sarojini Market", "Sarojini Nagar, Near Dilli Haat, Delhi",
                "This is also a thriving market, famous for cheap articles. The articles of this market usually comprises of rejected goods from the packages sent for export. Due to surplus supply of articles, you can always find a better price with bargaining.",
                28.5769069, 77.1940743));
        //Central Market
        shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi18, "Central Market", "Lajpat Nagar, New Delhi",
                "Also called as the Lajpat Nagar market, this caters to the needs of middle-class shoppers. The main attraction of this market is the mehandi.",
                28.5691204, 77.2395249));
        //Connaught Place
        shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi19, "Connaught Place", "Rajiv Chowk, Delhi",
                "Connaught Place is a frenetic business and financial hub, centered on a ring of colonnaded Georgian-style buildings with global chain stores, vintage cinemas, bars and Indian restaurants.",
                28.6289017, 77.2065322));
        //Select City Walk
        shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi20, "Select City Walk", "Saket, New Delhi",
                "This is a huge mall, famous for branded showrooms and food joints. You can explore the mall, as a part of a small trip. There are numerous things to buy, items to explore and unique services to enjoy here.",
                28.5288523, 77.2173552));
        //DLF Promenade
        shoppingItemArrayList.add(new HangoutItem(R.drawable.dlfpromenade, "DLF Promenade", "Vasant Kunj, New Delhi",
                "DLF Promenade caters to customers who are looking for a quality shopping experience coupled with a chic ambience. By the virtue of its offerings, DLF Promenade has earned the distinction of being the Delhi’s fashion capital. Spread over 4.6 lacs of square foot area.",
                28.5423485, 77.1541301));

        //
        monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi21, "Red Fort", "Chandni Chowk, New Delhi",
                "One of the most relevant historical places in Delhi, the Red Fort constructed with vibrant red sandstone was built by Shahjahan and was the political centre. The Mughals called it their home for some 200 odd years.",
                28.6562176, 77.2361931));
        //
        monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi22, "Qutub Minar", "Seth Sarai, Mehrauli, New Delhi",
                "The Qutb Minar, also spelled as Qutub Minar and Qutab Minar, is a minaret and victory tower that forms part of the Qutb complex.",
                28.5244946, 77.183329));
        //
        monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi23, "India Gate", "Rajpath, India Gate, New Delhi",
                "The India Gate is a war memorial located astride the Rajpath, on the eastern edge of the ceremonial axis of New Delhi, formerly called Kingsway.",
                28.612912, 77.227321));
        //
        monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi24, "Jama Masjid", "Chandni Chowk, New Delhi",
                "The Jama Masjid was regarded as a symbolic node of Islamic power across India, well into the colonial era.",
                28.6506792, 77.2312534));
        //
        monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi25, "Akshardham", "Noida Mor, Pandav Nagar, New Delhi",
                "Over 11,000 artisans worked on this lavishly decorated Hindu temple complex inaugurated in 2005.",
                28.663684, 77.2952913));
        //
        monumentsItemArrayList.add(new HangoutItem(R.drawable.jantarmantar, "Jantar Mantar", "Connaught Place, Sansad Marg, New Delhi",
                "The observatory in the capital is a very important historical monument in Delhi. The ancient astronomical instrument was constructed by Maharaja Jai Singh of Jaipur. Interestingly, there is a Jantar Mantar in Jaipur as well. Basically, based on the position of the sun during the day, one can speculate the time.",
                28.6246773, 77.2140524));

        addcityitem(R.drawable.delhi, "Delhi", "Delhi, India’s capital territory, is a massive metropolitan area in the country’s north. In Old Delhi, a neighborhood dating to the 1600s, stands the imposing Mughal-era Red Fort, a symbol of India.",
                "25 C", "clear Sky", 93, R.drawable.delhi2, 28.6466773, 76.8130722
                , funfactsDelhi, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addbangalore() {
        ArrayList<FunFactItem> funfactsBangalore = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsBangalore.add(new FunFactItem("A fact about Bangalore not known to many - It has the most number of Nobel Prize nominees. CV Raman was one of the most popular nominees of them all.",
                R.drawable.bangalore1));
        funfactsBangalore.add(new FunFactItem("The Forbes magazine considers Bangalore as one of “The Next Decade’s Fastest-Growing Cities”. The last 2 decades has seen tremendous growth of the city.",
                R.drawable.bangalore2));
        funfactsBangalore.add(new FunFactItem("In the year 1906, Bangalore became the first ever city in India to be electrified. It was powered by a hydroelectric station which is set up in Shivanasamudra at a distance of about 125 km from Bangalore.",
                R.drawable.bangalore3));

        //Nandi Hills
        hangoutItemArrayList.add(new HangoutItem(R.drawable.nandihills, "Nandi Hills", "Nature Hotspot",
                "Nandi Hills, a small albeit beautiful town, is just 60 km away from the city of Bangalore and has emerged as the perfect weekend getaway for its people. Even though it is most well-known for its viewpoints and its greenery, Nandi Hills is also a popular historical fortress that is home to a number of temples, monuments and shrines."
                , 13.3829311, 77.6515072));
        //Mysore Palace
        hangoutItemArrayList.add(new HangoutItem(R.drawable.mysorepalace, "Mysore Palace", "Old Monument",
                "The Mysore Palace, officially known as Mysuru Palace, is a historical palace and the royal residence at Mysore in the Indian State of Karnataka. It is the official residence of the Wadiyar dynasty and the seat of the Kingdom of Mysore."
                , 12.3051682, 76.6529862));
        //Ramanagara
        hangoutItemArrayList.add(new HangoutItem(R.drawable.ramanagara, "Ramanagara", "Iconic Place",
                "If you remember the classic Sholay scenes then you will be amazed to see the rocky mountains of this town that is situated around 50 KM from Bengaluru city and Sholay was originally shot here. From Silk farming to Mysore-Pak, from leading into the huge Hanuman statue entrance to the Ramadevara Betta Vulture Sanctuary; Ramanagara is one of the places to visit in Bangalore to enjoy heaps of activities like camping and trekking, and also an abundance of sightseeing option."
                , 12.714359, 77.2668972));
        //VV Puram Food Street
        hangoutItemArrayList.add(new HangoutItem(R.drawable.vvpuramfoodstreet, "VV Puram Food Street", " Street Food Hub",
                "This stretch of a lane is a foodie’s paradise which is located close to the famous Lal Bagh at Sajjan Rao circle in Bangalore which is famous as Thindi Beedi, Chaat Road/Street, VV Puram. From North Indian chaat items to South Indian healthy delicacies, this food streets caters from each corner of India and serve only vegetarian food items."
                , 12.951896, 77.5748843));
        //Lal Bagh Botanical Garden
        hangoutItemArrayList.add(new HangoutItem(R.drawable.lalbaghgarden, "Lal Bagh Botanical Garden", "Nature Hotspot",
                "Lalbagh is one of the oldest botanical gardens in India and is also a major tourist attraction in South India. Located in South Bengaluru, the Lalbagh Botanical Garden is not only one of the largest botanical gardens in India, but also the first of its kind, with planned routes, glasshouses and ornamental flowers growing throughout the property."
                , 12.9507432, 77.5825886));
        //Bannerghatta National Park
        hangoutItemArrayList.add(new HangoutItem(R.drawable.bannerghattanationalpark, "Bannerghatta National Park", "National Park",
                "Located on the outskirts of Bangalore, and usually known as BBBP, the Bengaluru Bannerghatta Biological Park is amongst the most popular and frequently visited destinations in the city. Catering to nature and wildlife enthusiasts, it is an integral part of the magnificent Bannerghatta National Park and is spread across a massive area. "
                , 12.8002807, 77.5743261));

        //Dum Pukht Jolly Nabobs
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.dumpukhtjollynabobs, "Dum Pukht Jolly Nabobs", "Lucknawi Cuisines",
                "This iconic restaurant beckons you to partake in a regal Anglo - Lucknawi culinary experience, aristocratic ambience and mouth-watering flavours."
                , 12.9555148, 77.6434173));
        //Karavalli
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.karavalli, "Karavalli", "South Western Coastal Cuisine",
                "Ingredients from the coast, such as cloves, cinnamon, pepper, home grown chillies and only the freshest vegetables and finest meats make it to the menu. The chef and team have painstakingly preserved India’s most refined culinary traditions from our rich heritage by restoring age old recipes, decades of researching meeting with locals and recreating forgotten flavours of a glorious bygone era."
                , 12.9723855, 77.6064367));
        //SHAO - Radisson Blu Bengaluru
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.shao, "Shao", "South East Asia Cuisines",
                "Tantalize your taste buds at award-winning signature restaurant, where chefs will mesmerize you with their skills. Shao brings to you the best of Chinese, Thai, Japanese, and Korean dishes under one roof for an unforgettable culinary experience."
                , 12.9502013, 77.6966796));
        //Le Cirque Signature - Franco Italian Restaurant
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.lecirquesignaturerestaurant, "Le Cirque Signature", "Italian Cuisine",
                "Dining at Le Cirque Signature is about colours and textures of the freshest ingredients, prepared meticulously by master chef complemented by gracious service which you can expect from the moment you step into the restaurant. Apart from private dining, the restaurant also has an Al fresco option looking out into the lush gardens and offering a glimpse of the architectural splendor of the palace hotel."
                , 12.9601983, 77.646318));
        //Taaza Thindi
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.taazathindi, "Taaza Thindi", "South Indian Cuisine",
                "One of the most popular traditional eateries in Bangalore. They have a very limited menu of idly, dosa, vada and milk. You'll find people rushing in all day to have the bites of authentic South Indian Cutlery."
                , 12.9260517, 77.5134064));
        //Truffles
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.truffles, "Truffles", "Continental Cuisines",
                "Truffles serve the continental cuisines ranging from Italian cuisine such as pizzas, pasta to breakfast buffets. Apart from this, they set their motos to serve quality food in in perfect hygienic conditions."
                , 12.926047, 77.5134063));

        //Garuda Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.garudamall, "Garuda Mall", "Magrath Rd, Ashok Nagar, Bengaluru"
                , "Garuda Mall is the premier shopping mall in the city of Bangalore, India, which is also home to the city’s second oldest Shoppers Stop branch, and the oldest one in the city which is attached to a mall."
                , 12.9702626, 77.6077742));
        //Mantri Square Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mantrisquaremall, "Mantri Square Mall", "Sampige Road, Malleshwaram, Bengaluru"
                , "Mantri Square is a shopping mall situated in the Malleswaram locality in Bangalore, Karnataka, India. Mantri Square is one of the biggest malls in the country. It also has metro rail-connectivity with Sampige Road metro station."
                , 12.9916302, 77.5689832));
        //Orion Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.orionmall, "Orion Mall", "Dr Rajkumar Rd, Rajajinagar, Bengaluru"
                , "Orion Mall is a shopping mall at Brigade Gateway Enclave in Bangalore, Karnataka, India developed by Brigade Group. The mall with a total shopping area of 8.2 Lakh sq.ft. is the 3rd largest in Bangalore."
                , 13.0110723, 77.5528044));
        //Royal Meenakshi Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.bangalore, "Royal Meenakshi Mall", "Cave Temple Road, Hulmaue, Bannerghatta Main Rd, Bengaluru"
                , "Royal Meenakshi Mall is South Bangalore's first complete mall with a hypermarket, retail, F&B, entertainment and multiplex. It fulfills a big need of South Bangalore when it comes to having quality retail shopping options as well as dining and entertainment options."
                , 12.8757979, 77.5938152));
        //Bangalore Central
        shoppingItemArrayList.add(new HangoutItem(R.drawable.bangalorecentral, "Bangalore Central", "J. P. Nagar, Bengaluru"
                , "The one of best mall in Bangalore.  Its very pleasant to visit the small, being small one stop for all purchase. Its somehow nicely located in a busy place."
                , 12.863918, 77.5823371));
        //VR Bengaluru
        shoppingItemArrayList.add(new HangoutItem(R.drawable.vrmall, "VR Bengaluru", "Mahadevapura, Bengaluru"
                , "VR Bengaluru, popularly known as Black Box On Whitefield Road, is a mixed-use retail development in India, situated in Whitefield, Bangalore. Its gross floor area is 600,000 square feet."
                , 12.9963804, 77.693202));

        //Bangalore Fort
        monumentsItemArrayList.add(new HangoutItem(R.drawable.bangalorefort, "Bangalore Fort", "Krishna Rajendra Rd, New Tharagupet, Bengaluru"
                , "Bangalore Fort was built by Kempe Gowda I, the founder of Bangalore, as a mud fort extending over a one-mile perimeter; it had nine large gates. Hyder Ali, after he took control of it in 1761, reinforced it with stones. However, much of this historical structure has lost out to the tides of time."
                , 12.9629009, 77.5738578));
        //Tipu Sultan’s Fort and Palace
        monumentsItemArrayList.add(new HangoutItem(R.drawable.tipusultanfort, "Tipu Sultan’s Fort and Palace", "Tippu Sultan Palace Rd, Chamrajpet, Bengaluru"
                , "Walk back in time and experience royal grandeur when you take a visit to Tipu Sultan’s Fort and Palace, located right in the heart of the city. Since the place served as the Sultan’s summer retreat, it is also known as Tipu Sultan’s Summer Palace. Interestingly, it was a part of the Bangalore Fort, but owing to its tourist prominence, has come to be known as a separate entity."
                , 12.9593513, 77.5714528));
        //Vidhana Soudha
        monumentsItemArrayList.add(new HangoutItem(R.drawable.vidhanasoudha, "Vidhana Soudha", "Ambedkar Bheedhi, Sampangi Rama Nagara, Bengaluru"
                , "Vidhan Soudha, the seat of Karnataka’s state legislature. There can be just one term to describe this building: an architectural gem. A fine example of the Neo-Dravidian style, with traces of Dravidian and Indo-Saracenic architectural elements, Vidhan Soudha is as enticing in its looks as the debates and discussions happening inside it."
                , 12.9796734, 77.5890556));
        //Bangalore Palace
        monumentsItemArrayList.add(new HangoutItem(R.drawable.bangalorepalace, "Bangalore Palace", "Vasanth Nagar, Bengaluru"
                , "Beauty and grandeur apart, what really catches everyone’s attention is the architecture of the building that follows the Tudor Revival style. Designed with turrets, battlements, and fortified towers, the exterior of the structure is as impressive as the interiors. Once you enter the palace, you will be surrounded by floral motifs, stylish wood carvings, cornices, and paintings."
                , 12.998766, 77.5899184));
        //Mayo Hall
        monumentsItemArrayList.add(new HangoutItem(R.drawable.mayohall, "Mayo Hall", "Ashok Nagar, Bengaluru"
                , "In the heart of Bangalore stands Mayo Hall, a remarkable monument built in honor of the 4th Viceroy of India, Lord Mayo. It is a beautiful two-storey structure that dates back to 1883. Strategically located, it offers a panoramic view of the Bangalore Race Course and the Brigade Grounds on one side and Ulsoor Lake and Parade Grounds on the other side."
                , 12.9729366, 77.6084219));
        //Attara Kacheri
        monumentsItemArrayList.add(new HangoutItem(R.drawable.attarakacheri, "Attara Kacheri", "Ambedkar Veedhi, Bengaluru"
                , "Attara Kacheri, a building that houses the High Court of Karnataka, merits count on both these aspects. Tracing its origin to 1884, it stands as one of the most significant historical buildings in the city. Attara Kacheri, means ‘eighteen departments’, is a two-storey, red brick building designed in the Neo-Gothic style of architecture."
                , 12.9778739, 77.5904463));

        addcityitem(R.drawable.bangalore, "Bangalore", "Bengaluru (also called Bangalore) is the capital of India's southern Karnataka state. The center of India's high-tech industry, the city is also known for its parks and nightlife. By Cubbon Park, Vidhana Soudha is a Neo-Dravidian legislative building.",
                "25 C", "Clear Sky", 93, R.drawable.bangalore, 12.9538477, 77.3507349
                , funfactsBangalore, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addchennai() {
        ArrayList<FunFactItem> funfactsChennai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsChennai.add(new FunFactItem("Chennai is, also recognized as the Detroit of India. Manufacturers of many international brands of vehicles are present, making it an important automobile hub. The beach attracts foreign companies due to their riverine and special geographical location."
                , R.drawable.detroit));
        funfactsChennai.add(new FunFactItem("The world’s second-longest urban beach is, also located in Chennai. Marina Beach in Chennai is, spread over about six kilometers. Marina Beach located on the coastline of Koom and Adyar cities is very beautiful to see. Apart from that, people come from far and wide to visit here. The evening of that Marina Beach in Chennai is extremely breathtaking and beautiful for tourists."
                , R.drawable.marinabeach));
        funfactsChennai.add(new FunFactItem("Chennai is the first city in India to have large-scale Wi-Fi access. At the same time, the conditional access system for cable TV was also implemented for the first time, which allows the user to control the content that comes on the TV. At the same time, the English newspaper Spectator started in 1836 was the first daily newspaper from Chennai in 1853."
                , R.drawable.chepauk));

        //Marina Beach
        hangoutItemArrayList.add(new HangoutItem(R.drawable.marinabeachview, "Marina Beach", "Nature Hotspot",
                "India's largest beach is right around the corner when one is in Chennai. With an extent from Fort St. George to Besant Nagar, the beach is lined with up palm trees. A view when sky and water meet at both the ends is just visible right in front of the eyes when one stands at the shores. An old lighthouse stands on the southern end of Marina along with several other structures like an aquarium, a swimming pool and a park nearby. The sunrise here is a classy example of breathtaking beauty."
                , 13.0437642, 80.2663439));
        //Kolli Hills
        hangoutItemArrayList.add(new HangoutItem(R.drawable.kollihills, "Kolli Hills", "Nature Hotspot",
                "One of the most interesting pilgrimages and religious places in Chennai is Kolli Hills or the ‘Mountain of Death’. Standing tall at 4265 ft. this picturesque mountain range, located in the Eastern Ghats, offers the perfect weekend escape."
                , 11.3392332, 78.2381365));
        //Birla Planetarium
        hangoutItemArrayList.add(new HangoutItem(R.drawable.birlaplanetarium, "Birla Planetarium", "Old Monument",
                "B. M. Birla Planetarium is a large planetarium in Chennai providing a virtual tour of the night sky and holding cosmic shows on a specially perforated hemispherical aluminium inner dome. The fifth B. M. Birla planetarium in the country, it is located at Kotturpuram in the Periyar Science and Technology Centre campus which houses eight galleries."
                , 13.0119386, 80.241848));
        //Thousand Lights Mosque
        hangoutItemArrayList.add(new HangoutItem(R.drawable.thousandlightmosque, "Thousand Lights Mosque", "Old Monument",
                "Since the architecture has a special corner in the heart of Chennai, Thousand Lights Mosque stands tall in this list. The place has got its name because of a special feature i.e. a total of 1000 oil lamps light up the hall of the mosque."
                , 13.0550856, 80.2529114));
        //Fort St. George
        hangoutItemArrayList.add(new HangoutItem(R.drawable.fortstgeorge, "Fort St. George", "Old Monument",
                "History of India with the British is a fact that can't be changed. And the live example standing in front is Fort St. George. During British rule, it was made as a centre point for official purposes but now encompasses St. George museum with paintings, coins, silverware, arms, porcelain, and documents."
                , 13.0800175, 80.2806821));
        //Mahabalipuram
        hangoutItemArrayList.add(new HangoutItem(R.drawable.mahabalipuram, "Mahabalipuram", "Old Monument",
                "Also known as Mamallapura,, Mahabalipuram is a small town situated in the southeastern part of Tamil Nadu, stretching between the Bay of Bengal and the Great Salt Lake. It is a renowned representative city of our rich Indian culture and heritage."
                , 12.6223265, 80.1736326));

        //Avartana
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.avartana, "Avartana", "South Indian Cuisine",
                "Exemplifies an exclusive blend of traditional & progressive renditions of Southern Indian cuisine, which is rooted to the gravitas of the unique tastes, aromas & flavours of southern Indian spices."
                , 13.010511, 80.2185193));
        //Madras Pavilion
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.madraspavilion, "Madras Pavilion", "Multi Cuisine",
                "A fine dining buffet and live station restaurant that serves the finest of Indian and international cuisines."
                , 13.0103097, 80.2182657));
        //Cheroot Malt And Cigar Lounge
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.cheroot, "Cheroot Malt And Cigar Lounge", "Club Cuisine",
                "The only distinguished corner in Chennai where they understand the harmony of an aromatic cigar with a smooth malt. The ideas and conversations flow on."
                , 13.010559, 80.2182443));
        //The Greenhouse Barbecue
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.greenhousebarbque, "The Greenhouse Barbecue", "Vegan Cuisine",
                "Ambience, soothing music, .beautiful aura and yummy food is what best describes the place. A large variety of vegetarian cusines and salads just makes the day perfect at  The Greenhouse Barbecue."
                , 13.0790425, 80.2512002));
        //Golden Dragon
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.goldendragon, "Golden Dragon", "Chinese Cuisine",
                "The legendary Golden Dragon at Taj Coromandel has a stunning and grand design. We offer a vast and assorted menu featuring a delightful mix of Sichuan and Cantonese flavours that promises an exquisite experience for your palate."
                , 13.079129, 80.2183692));
        //Jamavar
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.jamavar, "Jamavar", "Indian Cuisine",
                "The signature restaurant of The Leela group, Jamavar, serves a magnificent and royal treat of the finest Indian dining experience. Jamavar offers a menu that is a rich blend of Indian recipes that weave the North with the South."
                , 13.0170508, 80.2717006));

        //Forum Vijaya Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.forumvijayamall, "Forum Vijaya Mall", "Arcot Road, Vadapalani, Chennai"
                , "Forum Vijaya Mall is a shopping mall located in Vadapalani, Chennai, Tamil Nadu, India, developed by Prestige Group. This mall has approx 650,000 square feet of retail space. More than 100 shops occupy its four floors."
                , 13.0498989, 80.2073131));
        //Phoenix Marketcity
        shoppingItemArrayList.add(new HangoutItem(R.drawable.phoenixmall, "Phoenix Marketcity", "Indira Gandhi Nagar, Velachery, Chennai"
                , "Phoenix Market City (Chennai) is a shopping mall developed by Phoenix Mills Limited located in Chennai, Tamil Nadu, India. It was opened in January 2013 and is the largest mall in the city. It was the fourth largest mall in India in 2018."
                , 12.990511, 80.2147877));
        //VR Chennai
        shoppingItemArrayList.add(new HangoutItem(R.drawable.vrchennai, "VR Chennai", "Thirumangalam, Anna Nagar, Chennai"
                , "VR Chennai is a shopping mall located on Jawaharlal Nehru Road in Anna Nagar West, Chennai, Tamil Nadu, India. This mall was opened to the public on 18 June 2018. It is one of the largest malls in Chennai by area, occupying 1,840,000 square feet built-up area with 1,000,000 square feet of retail space."
                , 13.0805465, 80.1949433));
        //Ampa Skywalk
        shoppingItemArrayList.add(new HangoutItem(R.drawable.ampaskywalk, "Ampa Skywalk", "Poonamalee High Road, Aminjikarai, Chennai"
                , "Ampa Skywalk is a shopping mall in Chennai, India. With three floors of retail space, it has outlets for major clothing and apparel brands, a seven-screen multiplex, a games zone and a food court."
                , 13.0734763, 80.2192545));
        //Express Avenue
        shoppingItemArrayList.add(new HangoutItem(R.drawable.expressavenue, "Express Avenue", "Express Estate, Thousand Lights, Chennai"
                , "Express Avenue is a shopping mall in Chennai promoted by Express Infrastructure, A division of Express Newspapers Pvt. Ltd. It is home to the largest gaming arcade in South India. Built at a cost of ₹7,500 million, the mall is spread over 1,750,000-square-foot, including 900,000-square-foot of leasable area."
                , 13.0584546, 80.2619957));
        //Welcome Shopping Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.welcomeshoppingmall, "Welcome Shopping Mall", "CIT Nagar West, T. Nagar, Chennai"
                , "Welcome Shopping Mall in Chennai is one of the leading businesses in the Imported Mobile Phone Dealers. Also known for Perfume Dealers, Imported Perfume Dealers, Imported Mobile Phone Dealers, Perfume Exporters and much more. Find Address, Contact Number, Reviews & Ratings, Photos, Maps of Welcome Shopping Mall, Chennai."
                , 13.0320316, 80.2308873));

        //Government Museum
        monumentsItemArrayList.add(new HangoutItem(R.drawable.governmentmuseum, "Government Museum", "Egmore, Chenna"
                , "The Government Museum in Chennai boasts of a large repository of curious exhibits defining art, archeology, anthropology, numismatics and diverse other subjects. From a cutting-edge life-size T-rex in animatronics to ancient sculptural specimens, there is a wealth of interesting things to see here. Besides the main building, the museum has a natural history section, a children’s museum, and zoological and botanical galleries."
                , 13.0708766, 80.2545483));
        //Valluvar Kottam
        monumentsItemArrayList.add(new HangoutItem(R.drawable.valluvarkottam, "Valluvar Kottam", "Nungambakkam, Chennai"
                , "Valluvar Kottam is part of the heritage of the city and one of the most important historical places in Chennai to visit, most appropriately during the early morning and dusk when the magnificent architecture of the monument is underlined in the sublime light."
                , 13.0544854, 80.2395705));
        //Fort St. George
        monumentsItemArrayList.add(new HangoutItem(R.drawable.fortsaintgeorgechennai, "Fort St. George", "Rajaji Road, Chennai"
                , "The foundation of the monumental white outlines of the Fort St. George is inseparable from the history of the origination of Chennai. The White Town in Chennai, unofficially known as Fort St. George, was established on the coasts of the then Madras city, forming one of the greatest British strongholds in Southern India."
                , 13.0796035, 80.2793224));
        //Alamparai Fort
        monumentsItemArrayList.add(new HangoutItem(R.drawable.alamparaifort, "Alamparai Fort", "Edaikazhinadu, Chennai"
                , "The Alamparai Fort built in the 17th-century is a magnificent sight to behold. The fort has been a witness to two counts of devastation, once by the British forces (1760) and later in the tsunami (2004)."
                , 12.2661452, 80.008014));
        //Vivekananda House
        monumentsItemArrayList.add(new HangoutItem(R.drawable.vivekanandahouse, "Vivekananda House", "Marina Beach Road, Triplicane, Chennai"
                , "This heritage house located on the Marina Beach Road, Neelam Basha Dargapuram in Triplicane, is where Swami Vivekananda had stayed for six weeks. Swami Ji’s coming here had played an important role in the Ramakrishna Movement in South India, documentation and memorabilia of which are preserved to date inside the house."
                , 13.0498494, 80.2782207));
        //Anna Memorial
        monumentsItemArrayList.add(new HangoutItem(R.drawable.annamemorial, "Anna Memorial", "Navalar Nagar, Chepauk, Chennai"
                , "Established on Marina Beach, this monument is dedicated to the memory of C. N. Annadurai- the late Chief Minister of Tamil Nadu and leader of the organization Dravida Munnetra Kazhagam. To the northern side of the memorial, there’s a museum on Annadurai which might be interesting for those interested in the personalities of Indian politics."
                , 13.0654347, 80.2834249));

        addcityitem(R.drawable.chennai, "Chennai", "Chennai, on the Bay of Bengal in eastern India, is the capital of the state of Tamil Nadu. The city is home to Fort St. George, built in 1644 and now a museum showcasing the city’s roots as a British military garrison.",
                "25 C", "clear Sky", 93, R.drawable.chennai, 13.0473748, 79.9288071
                , funfactsChennai, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addhyderabad() {
        ArrayList<FunFactItem> funfactsHyderabad = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsHyderabad.add(new FunFactItem("This is a not a unique fact, but Hyderabad is the home to the most delicious and a huge variety of biryanis. It is said that the Nizams served 26 varieties of biryani to their guests at a given point of time."
                , R.drawable.biryani));
        funfactsHyderabad.add(new FunFactItem("Hyderabad has one of the two official retreats for the President of India and each year the President spends time here doing his official work at Rastrapathi Nilayam during winter when Delhi becomes real cold."
                , R.drawable.rashtrapatinilayam));
        funfactsHyderabad.add(new FunFactItem("The Koh-i-Noor (the “Mountain of Light”) , which was once the largest known diamond in the world was originally mined in Kollur mines of andhra and then had its way to golconda fort. Golconda is famous for producing some of the world’s most valued diamonds like the Hoe diamond and the Darya-i-noor."
                , R.drawable.kohinoor));

        //Charminar
        hangoutItemArrayList.add(new HangoutItem(R.drawable.charminar, "Charminar", "Old Monument",
                "The epic signature of the city, Charminar makes for a wonderful sight. Located in the heart of Hyderabad’s old city, surrounded by Mecca Masjid, built using bricks from Mecca and Laad Bazaar - a boisterous shopping street, this landmark is laced in history. Built in 1591 by Muhammad Quli Qutub Shah, it was constructed to commemorate the founding of Hyderabad and also to ward of a deadly epidemic that was rampant then in the Golconda region. Graced by 4 minarets soaring almost 50ft in height, it has a mosque and 45 prayer spaces is amongst the famous places in Hyderabad."
                , 17.3615687, 78.4724758));
        //Hussain Sagar Lake
        hangoutItemArrayList.add(new HangoutItem(R.drawable.hussainsagar, "Hussain Sagar Lake", "Nature Hotspot",
                "One of the largest man-made lakes in India, Hussain Sagar Lake has been adorning the twin cities of Hyderabad and Secunderabad since 1562. A tourist destination that cannot be missed as places to visit in Hyderabad with family, the lake is best to spend time around dusk with pleasant air filling the surroundings. Adding to its charm is the monolithic statue of the Buddha installed in the heart of the lake. Several facilities around the lake periphery such as boating and water sports, and the neighbourhood Lumbini Park, an amusement park are add-on attractions."
                , 17.4094921, 78.4731487));
        //Golconda Fort
        hangoutItemArrayList.add(new HangoutItem(R.drawable.golcondafort, "Golconda Fort", "Old Monument",
                "Golconda is one of the historical places to visit in Hyderabad. Originally built in mud on a 400ft hill, the fort ruins of today have seen the reign of several dynasties. Situated 11km away from the bustling urbanism of Hyderabad, it derives its name from a Telugu word meaning Shepherd’s Hill. Reminiscence of a well-planned Golconda city within the fortress limits is evident even now. The Sound & Light show brings alive the grandeur of one of India’s famous forts."
                , 17.3834143, 78.3926917));
        //Ramoji Film City
        hangoutItemArrayList.add(new HangoutItem(R.drawable.ramojifilmcity, "Ramoji Film City", "Nature Hotspot",
                "Certainly one of the best places to visit in Hyderabad with family, Ramoji Film City makes its way to every traveller’s list because of its magical theme around cinema, which is the most common love of every Indian. Ramoji Film city is said to be one of the haunted destinations in India. The only one of its kind in India, this holiday destination offers something special to everyone and is one of the best places to visit in Hyderabad."
                , 17.2757164, 78.6455648));
        //Falaknuma Palace
        hangoutItemArrayList.add(new HangoutItem(R.drawable.falaknumapalace, "Falaknuma Palace", "Old Monument",
                "Sprawling across 32 acres and 2,000 feet above the city of Hyderabad, Taj Falaknuma is as royal as it sounds. One of the top Hyderabad tourist places, this noble piece of architecture and royalty is often referred to as the ‘mirror of sky.’ Inspired by the Italian architecture and encored with Venetian chandeliers, flawless décor, and old-world aura of Nizams, Taj Falaknuma must be on your list of sightseeing places in Hyderabad."
                , 17.3309601, 78.4653153));
        //Birla Mandir
        hangoutItemArrayList.add(new HangoutItem(R.drawable.birlamandir, "Birla Mandir", "Nature Hotspot",
                "The Birla Mandir is an enchanting modern temple built atop the Kala Pahad, the twin hillock of the Naubat Pahad. With mixed architectural styles from Odhisha and South Indian, the place of worship is embellished with exotic epic scenes from the Ramayana and Mahabharata that are finely sculpted in marble. The inner shrine of the temple has an 11ft tall replica of Tirupati Venkateswara."
                , 17.3956606, 78.4691108));

        //Golconda Pavilion
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.golcondapavilion, "Golconda Pavilion", "Multi Cuisine",
                "The warm and inviting all day dining restaurant, serving a thoughtfully curated menu of dishes from around the world."
                , 17.4323101, 78.3829044));
        //Tatva
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.tatva, "Tatva", "Multi Cuisine",
                "Tatva is a fresh amalgamation of traditional diversity and contemporary elements that brings all your senses to life. It is a remarkable confluence of a cafe and restaurant under the same roof. It explores the intriguing interplay of flavours, interiors and aroma that create an ideal space to activate all your senses. It turns fine ingredients into culinary masterpieces and offers an unparalleled dining experience."
                , 17.4323093, 78.3675834));
        //Celeste
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.celeste, "Celeste", "Italian and Mediterranean Cuisines",
                "This elegant all-day-dining restaurant offers classical Italian and Mediterranean fare that appeals to the palate of even the most discerning connoisseurs. The fine pizzas and pastas, antipasti and cutlets are created with ingredients sourced from across the globe. A truly bespoke experience for a bon vivant."
                , 17.3301889, 78.397596));
        //Okra
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.okra, "Okra", "Multi Cuisine",
                "Treat yourself to Indian and International cuisine in our casual restaurant, Okra. Open for all-day dining, our restaurant in Hyderabad offers a relaxed atmosphere, a breakfast buffet and an A la Carte menu for breakfast, lunch and dinner."
                , 17.4242816, 78.4172118));
        //Verandah
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.verandah, "Verandah", "Indian and Italian Cuisines",
                "With a design influenced by the colours and forms of landscaped Anglo-Indian gardens, Verandah transforms throughout the day for around-the-clock dining complemented by knockout city views. Signature Indian and Italian dishes are popular as are the buffets and choice selections from the coffee bar."
                , 17.4242571, 78.4172116));
        //Fabelle - The Chocolate Boutique
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.fabelle, "Fabelle", "The Chocolate Boutique",
                "Fabelle, a one of its kind luxury experience of handcrafted chocolate creations that activates your senses like never before."
                , 17.4319654, 78.3847979));

        //GVK One Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.gvkmall, "GVK One Mall", "Banjara Hills, Hyderabad"
                , "The Mall is located just next to the five star hotel Taj Krishna. GVK One mall is a well known destination for shopping, entertainment or hanging around with family and friends on weekends. It is a 50,000 square feet mall with food, shopping and entertainment zones."
                , 17.419319, 78.4463022));
        //City Center Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.citycentermall, "City Center Mall", "Banjara Hills, Hyderabad"
                , "City Center Mall is a combination of contemporary design, modern architecture, and finest facilities to give shoppers an unforgettable shopping experience. It is home to world’s best brands and its design and functionality compares to the best malls of Asia."
                , 17.4150974, 78.4466799));
        //Inorbit Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.inorbitmall, "Inorbit Mall", "Madhapur, Hyderabad"
                , "Inorbit Mall, is home to 123 brands like H&M, Shoppers Stop, Forever 21, Bath & Body Works, Starbucks and more. Experience world-class features like an extensive food court, 6-screen multiplex and gaming zone. Amenities include 1400 capacity parking, free Wi-Fi, ATM, kids’ play area, etc."
                , 17.434542, 78.3847658));
        //Hyderabad Central
        shoppingItemArrayList.add(new HangoutItem(R.drawable.centralmallhyd, "Hyderabad Central", "Gachibowli, Hyderabad"
                , "The one of best mall in Hyderabad.  Its very pleasant to visit the small, being small one stop for all purchase. Its somehow nicely located in a busy place."
                , 17.4418559, 78.3608873));
        //L&T Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.ltmall, "L&T Mall", "Punjagutta, Hyderabad"
                , "The L&T Metro Mall Punjagutta is spread over an area of 5 lakh square feet and houses the PVR Multiplex, a plethora of shopping, dining & entertainment destinations."
                , 17.4291596, 78.4479487));
        //Sarath City Capital Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.sarathcitymall, "Sarath City Capital Mall", "Kondapur, Gachibowli, Hyderabad"
                , "Sarath City Capital Mall is situated in the busy neighborhood of Hyderabad’s technology corridor – Hi-Tech City ,Gachibowli – Miyapur Road that serves the entire cosmopolitan community of this part of Hyderabad. The mall has everything from Prestigious International brands to Local Niche brands that serves the customer in various ways."
                , 17.4575952, 78.3617606));

        //Qutub Shahi Tombs
        monumentsItemArrayList.add(new HangoutItem(R.drawable.qutubshahitombs, "Qutub Shahi Tombs", "Qutub Shahi Tombs, Hyderabad"
                , "Qutb Shahi Tomb is one of the most iconic Islamic sites that hold the prominence of being the oldest monuments in Hyderabad. With a magnificent blend of Indian and Persian architectural styles, these tombs are revered as one of the most important historical sites in India. These tombs were laid as a solemn reminder of the glory and grandeur of Golconda and great kings who were buried over here."
                , 17.3955806, 78.3905188));
        //Chowmahalla Palace
        monumentsItemArrayList.add(new HangoutItem(R.drawable.chowmahallapalace, "Chowmahalla Palace", "Motigalli, Khilwat, Hyderabad"
                , "Built between 1857 and 1869 in Hyderabad, the Chowmahalla Palace is almost 200 years old and was once the official seat of the Asaf Jahi dynasty. Now, it is one of the major tourist destinations in Hyderabad, and is known for its magnificent architecture and awe-inspiring beauty."
                , 17.3578233, 78.469501));
        //Purani Haveli
        monumentsItemArrayList.add(new HangoutItem(R.drawable.puranihaveli, "Purani Haveli", "Pathar Gatti, Hyderabad"
                , "One of the historical places of Hyderabad from the golden era, Purani Haveli is a remarkable structure that was built to serve the Peshwa Mir Momen of Mohammed Quli Qutub. The haveli is one of the finest monuments of Hyderabad which functions as an art gallery and museum."
                , 17.36551, 78.4816352));
        //Taramati Baradari
        monumentsItemArrayList.add(new HangoutItem(R.drawable.taramatibaradari, "Taramati Baradari", "Ibrahim Bagh, Hyderabad"
                , "Taramati Baradari is an ancient and historical Sarai which was built in the 1880s. Baradari is a building with 12 open doors to allow free-flow of air and Taramati Baradari is one of its kind monument in Hyderabad. It is located along the Musi river near the Persian-style garden, Ibrahim Bagh and is very close to Golconda Fort and it is one of the best historical places in Hyderabad."
                , 17.3754592, 78.3774733));
        //Salar Jung Museum
        monumentsItemArrayList.add(new HangoutItem(R.drawable.salarjungmuseum, "Salar Jung Museum", "Darulshifa, Hyderabad"
                , "Salar Jung Museum of Hyderabad is a prominent art museum in India. It has gained substantial popularity in hosting the largest one-man collection of exquisite antiques and art pieces. The museum is considered as one of the renowned tourist destinations of Hyderabad, alluring tourists from all across India and abroad."
                , 17.3713437, 78.4792221));
        //Mecca Masjid
        monumentsItemArrayList.add(new HangoutItem(R.drawable.meccamasjid, "Mecca Masjid", "Charminar, Ghansi Bazaar, Hyderabad"
                , "Mecca Masjid, which is located on the south of the Musi River, is one of the largest and oldest mosques in India. It is one of the heritage sites, located in the old city, very near to Charminar, an iconic symbol of Hyderabad city. A preferred destination of Lakhs of Muslim pilgrims."
                , 17.3604416, 78.4713825));

        addcityitem(R.drawable.hyderabad, "Hyderabad", "Hyderabad, a major center for the technology industry, it's home to many upscale restaurants and shops. Its historic sites include Golconda Fort, a former diamond-trading center that was once the Qutb Shahi dynastic capital.",
                "25 C", "clear Sky", 93, R.drawable.hyderabad, 17.4122998, 78.267957
                , funfactsHyderabad, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addkolkata() {
        ArrayList<FunFactItem> funfactsKolkata = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsKolkata.add(new FunFactItem("Kolkata is surely a paradise for book lovers. It houses the country's largest second-hand book market and world's second largest. Another reason why flocks of bibliophiles come to this city all year round. Added fact, National Library is the country's largest and oldest public library."
                , R.drawable.kolkata1));
        funfactsKolkata.add(new FunFactItem("Kolkata has Asia's largest planetarium known as Birla Planetarium and it also happens to be the second largest in the world. Constructed in 1963, it was inaugurated by the then Prime Minister, Jawahar Lal Nehru himself."
                , R.drawable.kolkata2));
        funfactsKolkata.add(new FunFactItem("Asia's oldest electric running tram is not in Mumbai or Delhi, but only in Calcutta operating across the City of Joy since 1902. Now, the bygone trams have been revamped and presented with their AC version which makes it further enjoyable and comfortable. It's not just the trams but Kolkata is the only city in the world where you can ride on hand-pulled rickshaws, running on the city streets since the British times."
                , R.drawable.kolkata3));

        //Victoria Memorial
        hangoutItemArrayList.add(new HangoutItem(R.drawable.victoriamemorial, "Victoria Memorial", "Old Monument",
                "While it originally got built with the idea of dedicating a memorial to Queen Victoria of Britain, it has now turned into a museum that attracts numerous people due to its stunning architecture and display. The artistic monument is a mixture of British as well as Mughal form of architecture. Inside the huge fortress is a museum that has 25 galleries featuring sculptures, portraits, national leaders, arms, and armour."
                , 22.5448082, 88.3403691));
        //Howrah Bridge
        hangoutItemArrayList.add(new HangoutItem(R.drawable.howrahbridge, "Howrah Bridge", "Nature Hotspot",
                "It was constructed in 1943 replacing the Pontoon Bridge and is made of steel. Due to the immense popularity that the bridge has, tourists from far and wide travel to Kolkata just to visit the amazing bridge. One will be amazed to see the view from the bridge in the evening. The entire river Hoogli seems like an endless lake with the sun going down into the horizon. The suspended bridge ranks 6th amongst the longest bridges in the world."
                , 22.5850383, 88.3425874));
        //Santiniketan
        hangoutItemArrayList.add(new HangoutItem(R.drawable.santiniketan, "Santiniketan", "Old Monument",
                "Santiniketan embodies Rabindranath Tagore’s vision of a place of learning that is unfettered by religious and regional barriers. Established in 1863 with the aim of helping education go beyond the confines of the classroom, Santiniketan grew into the Visva Bharati University in 1921, attracting some of the most creative minds in the country."
                , 23.6783675, 87.6728296));
        //Botanical Garden
        hangoutItemArrayList.add(new HangoutItem(R.drawable.botanicalgarden, "Botanical Garden", "Nature Hotspot",
                "The Calcutta Botanical Garden, the garden was established in 1786. It is spread over 270 acres of land. The present name of the garden is Acharya Jagadish Chandra Bose Indian Botanical Garden. The garden is full of plants, trees, and flowers related to the field of botany. At the moment, the garden is a home for over 12000 perennial plants that are still alive. One of the best attractions here is the giant Banyan Tree which forms the second largest canopy in the world."
                , 22.5567142, 88.3019096));
        //Tagore’s House
        hangoutItemArrayList.add(new HangoutItem(R.drawable.tagorehouse, "Tagore’s House", "Old Monument",
                "Tagore’s house is a museum dedicated to the life and works and besides his work, the museum also houses works of members of other pious families like Maharshi Devendranath Tagore, Jyotirindranath, Abanindranath and Dinendranath Tagore. For artifact lovers, the museum displays old musical records of Tagore."
                , 22.5849347, 88.3503932));
        //Kalighat Kali Temple
        hangoutItemArrayList.add(new HangoutItem(R.drawable.kalighattemple, "Kalighat Kali Temple", "Old Monument",
                "The temple has a highly unique image that differs from most Kali images in Bengal. Kalighat Kali Temple is a popular tourist attraction of Kolkata and is considered as one of the 52 Shakti Peethas of India. Religious inquisitives may be delighted to know that the temple is said to be the site where the toes of the right foot of Sati fell. In the first phase of construction, only the face of the deity was constructed. Later on, the remaining parts of Kali that included the hands, tongue and jewellery were constructed using gold and silver."
                , 22.520273, 88.3418166));

        //Peter Cat
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.petercat, "Peter Cat", "Multi Cuisines",
                "Eating at Peter Cat is an experience. It is the only restaurant in Kolkata which serves authentic sizzlers. From the ambiance to the lip-smacking dishes, Peter Cat is undoubtedly one of the best restaurants to try in Kolkata. This eatery has been a part of the city for a long time, and still, it is loved by the people living there. In case you visit there, do not forget to try the famous Chelo Kebab platter. It is one of the juiciest meat dishes there in India. The restaurant is located in Park Street, which is genuinely the hotspot for restaurants in Kolkata."
                , 22.5524248,88.3503477));
        //Alfresco
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.alfresko, "Alfresco", "Multi Cuisines",
                "For those of you who want to enjoy a nice meal in the lap of luxury and sophistication, Alfresco is the best place for you. Even though the cost of each meal is pretty extravagant, but the ambiance and food quality make up for the hefty fee. You can opt for the buffet or Brunch over there as they are comparatively less pricey. The restaurant is best known for its fantastic dishes like Kosha Mangsho and Pulao. Moreover, the location of this restaurant is pretty impressive. It is located at the heart of Kolkata in The Lalit in Dalhousie Square."
                , 22.5681987,88.3477393));
        //Mocambo
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mocambo, "Mocambo", "Continental & Italian Cuisines",
                "Mocambo is another well-known restaurant in Kolkata which has been opened since the 1950s. Apart from the delicious food, the restaurant is quite renowned for its ambiance. It is one of the first restaurants in the city which started serving authentic continental dishes. Most people love to devour the sauced prawn cocktail while dining in Mocambo. As the restaurant is opened until 11.20 P.M., you will be able to get a late dinner. The best part about Mocambo is that it has kept the same menu since its opening."
                , 22.5533332,88.3510587));
        //The Biker’s Café
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.thebikerscafe, "The Biker’s Café", "Multi Cuisines",
                "Even though The Biker’s Café is not as old as the other eateries mentioned in this list, it is one of the few restaurants which serve American dishes in Kolkata. From the name, you can guess that the restaurant is dedicated to everything bike related. The ambiance and interior decoration of this place will impress you if you are into motorcycles. Besides lip-smacking food, the restaurant also offers board games so that you can have fun with your friends. The restaurant also has continental dishes, which are equally delicious."
                , 22.5377639,88.3468688));
        //Mrs. Magpie
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mrsmagpie, "Mrs. Magpie", "Bakery",
                "Even though most people think that Bengalis are only good at preparing traditional sweets, but Mrs. Magpie proves them wrong, this bistro is one of the best dessert bakeries in India. Several people in Kolkata love it. Not only desserts, but the hot chocolate and coffee over there are also pretty popular. If you visit Mrs. Magpie, remember to try the chicken slider and scones. They are amazingly delicious. Visitors to Kolkata must try the food served at Mrs. Magpie."
                , 22.5163719,88.3596593));
        //Oudh 1590
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.oudh1590, "Oudh 1590", "Awadhi & Mughlai Cuisines",
                "Oudh 1590 is one of the best restaurants for tourists to try in Kolkata, as it is considered the best Mughal restaurant in the city. Apart from the fantastic dishes, the eatery has a perfect interior decoration and ambiance. You will genuinely travel back to the Mughal era after entering Oudh 1950. Most people love to order the famous Galouti Kebab over and over when they visit there. The Deshapriya Park branch of Oudh is the oldest and the best one in Kolkata. Despite the restaurant being so famous, the cost of a meal is not that high."
                , 22.5186144,88.3480505));

        //South City Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.southcitymall, "South City Mall", "Jadavpur, Kolkata",
                "Located on Prince Anwar Shah Road in the southern end of the city, the South City Mall is a state of the art mall with a shopping area of about 1,000,000 square feet. Consumers can select from a range of exclusive international and national retail brand outlets that load up the area. There is also a multiplex located in the mall where movie buffs can enjoy their day out."
                , 22.501714,88.3595499));
        //Quest Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.questmall, "Quest Mall", "Beck Bagan Row, Kolkata"
                , "Another place for Shopping in Kolkata, inaugurated in the year 2013, the Quest Mall has a range of stores to cater the needs of people with food courts, gaming areas, multiplex and what not. The INOX multiplex here has six screens."
                , 22.5389519,88.3635651));
        //Avani Riverside Shopping Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.avaniriversidemall, "Avani Riverside", "Choura Bustee, Shibpur, Kolkata"
                , "Located on the banks of River Hooghly, this place for Shopping in Kolkata has a picturesque location. One of the first mega malls in the Howrah area, the mall boasts o big names like TimeOut, Reliance Trends etc. There is also a PVR located on its premises."
                , 22.5632174,88.3215144));
        //Mani Square Shopping Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.manisquaremall, "Mani Square", "Eastern Metropolitan Bypass, Kolkata"
                , "The mall is located on the Manicktala main road and has an array of favourite brands like Adidas, United Colors of Benetton, Levis, Lee Cooper and Spencer's. The brand was inaugurated in the year 2008. A multiplex, various food outlets and gaming zones add to the charisma."
                , 22.5803562,88.398407));
        //Acropolis Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.acropolismall, "Acropolis Mall", "East Kolkata Township, Kolkata",
                "The Acropolis, imposing architectural wonder in Athens, is an universal symbol of the classical spirit and civilization and therefore considered as the greatest architectural and artistic complex bequeathed by Greek Antiquity to the world. Hence the name is apt for this property, which is the largest commercial building and also the landmark to define good life in this part of the city."
                , 22.5143232,88.3917601));
        //DLF Galleria
        shoppingItemArrayList.add(new HangoutItem(R.drawable.dlfgalleriamall, "DLF Galleria", "Newtown, Kolkata",
                "DLF Galleria is one of the commercial development of DLF Group, located in Kolkata. It offers spacious and skillfully designed retail shops, commercial spaces and office space. The project is well equipped with all the amenities to facilitate the needs of the office people."
                ,22.5826554,88.4627838));

        //Fort William
        monumentsItemArrayList.add(new HangoutItem(R.drawable.fortwilliam, "Fort William", "Hastings, Kolkata"
                , "Fort William, one of the must-visit forts in Kolkata, stands as an iconic structure, reminiscent of the city’s colonial legacy. Sitting on the eastern banks of River Hooghly, the fort covers an area of about 70 hectares. Named after King William III, this fort dates back to the year 1696 and is adorned with intricate stonework. Presently, the fort serves as the Indian Army headquarters of the Eastern Command and so, entry to the inner sections of the fort is restricted for civilians."
                , 22.5542459,88.3336857));
        //Belur Math
        monumentsItemArrayList.add(new HangoutItem(R.drawable.belurmath, "Belur Math", "Monument"
                , "Located on the west bank of River Hooghly, Belur Math serves as the headquarters of the Ramakrishna Math and Mission. This place was established by Swami Vivekananda and is noted for its splendid architecture that integrates Hindu, Islamic, Buddhist, and Christian motifs to symbolize the unity of all religions. Spread over 40 acres, Belur Math houses the main monastery of the Ramakrishna Order. Besides it also has temples for Ramakrishna, Sarada Devi and Swami Vivekananda, and a museum within its premises."
                , 22.6321853,88.3537025));
        //Marble Palace
        monumentsItemArrayList.add(new HangoutItem(R.drawable.marblepalace, "Marble Palace", "Old Monument"
                , "This palatial mansion in North Kolkata was built by Raja Rajendra Mullick, an affluent Bengali merchant. This well-preserved 19th-century residence derives its name from its marble walls, floors, and sculptures. One of the best-known heritage monuments in Kolkata, this mansion is designed in neoclassical architectural style. Marble Palace also boasts of a rich collection of paintings and priceless artworks. A visit to this palace is certainly one of the top things to do in Kolkata, especially for history buffs and art lovers."
                , 22.5821869,88.3579982));
        //Indian Museum
        monumentsItemArrayList.add(new HangoutItem(R.drawable.indianmuseum, "Indian Museum", "Old Monument"
                , "Established in 1814, Indian Museum is one of the largest and oldest multipurpose museums in Kolkata and in the entire country. The museum is housed in a huge imperial structure and is a treasure trove of the finest collection of objects and artifacts of historical significance. Among the priceless assets of this museum are a 4000-year old Egyptian mummy and some brilliant sculptures on the life of Lord Buddha."
                , 22.5579447,88.3422227));
        //Jorasanko Thakur Bari
        monumentsItemArrayList.add(new HangoutItem(R.drawable.jorasankothakurbari, "Jorasanko Thakur Bari", "Old Monument"
                , "Jorasanko Thakur Bari, another prominent historical site in Kolkata, is the ancestral home of the Nobel laureate Rabindranath Tagore. This 18th-century residence was built on a piece of land donated to Dwarkanath Tagore, the poet’s grandfather, by the renowned Sett family of Burrabazar. Also known as Tagore House, this is the home where the poet was born, spent a major part of his childhood, and breathed his last. At present, the house serves as a museum displaying a rich collection of books, manuscripts, and other antique items related to the poet’s life."
                , 22.5849351,88.3569582));
        //Nizam Palace
        monumentsItemArrayList.add(new HangoutItem(R.drawable.nizampalace, "Nizam Palace", "Sreepally, Elgin, Kolkata",
                "As one of the heritage buildings in Kolkata, expect Nizam Palace to reflect the beauty and serenity of a vintage property. The moment you step onto the palatial grounds, the old-world charm would surround you and leave you mesmerised. The place has also been visited by King Edward VIII."
                , 22.5408039,88.3490524));

        addcityitem(R.drawable.kolkata, "Kolkata", "Kolkata (formerly Calcutta) is the capital of India's West Bengal state. Founded as an East India Company trading post, it was India's capital under the British Raj from 1773–1911. ",
                "25 C", "clear Sky", 93, R.drawable.kolkata, 22.6757521, 88.0495272
                , funfactsKolkata, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addvishakhapatnam() {
        ArrayList<FunFactItem> funfactsVishakhapatnam = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsVishakhapatnam.add(new FunFactItem("The city is home for India's first naval base. The Eastern Naval Command Established one of its 3 Major bases in Vishakhapatnam which is also its headquarters  and is responsible for states of Andhra Pradesh, Orissa, Tamil Nadu, West Bengal and Andaman & Nicorbar Islands."
                , R.drawable.navalbase));
        funfactsVishakhapatnam.add(new FunFactItem("Visakhapatnam hosts two of the largest ports in the country, the only city in India to do so. While the Vishakhapatnam port, one of 13 major ports in India  and the only major port of Andhra Pradesh which also happened to be   India’s second largest port by volume of cargo handled has been opened in 1933."
                , R.drawable.visakhapatnamports));
        funfactsVishakhapatnam.add(new FunFactItem("In 1971 during the Indo-Pakistan war Vizag witnessed the Pakistani submarine Ghazi being destroyed by Indian warship”INS RAJPUT” off the coast of Visakhapatnam."
                , R.drawable.insrajput));

        //Araku
        hangoutItemArrayList.add(new HangoutItem(R.drawable.araku, "Araku", "Nature Hotspot",
                "Colloquially known as the Ooty of Andhra, the Araku Valley is an exquisite hill station located only a few kilometres from the city of Vizag. Inhabited by different tribes, this place is a part of the Eastern Ghats range of India. The region is also commercially vital since it is mined for bauxite. The rich biodiversity is a tourism booster of Araku Valley."
                , 18.3294334, 82.8549623));
        //Yarada Beach
        hangoutItemArrayList.add(new HangoutItem(R.drawable.yaradabeach, "Yarada Beach", "Nature Hotspot",
                "The Bay of Bengal borders the beach and gives it a serene outlook. On the other three sides, towering hills border the beach, making it a calm and peaceful sanctuary for tourists and locals alike. Soft greenery covering the side of the rocks and tall palms make a relaxing site. It is one of the best places to visit in Vizag and can be enjoyed both solo and with the company."
                , 17.6578658, 83.2643518));
        //Katiki Waterfalls
        hangoutItemArrayList.add(new HangoutItem(R.drawable.kaitikiwaterfalls, "Katiki Waterfalls", "Nature Hotspot",
                "The 50 feet high Katiki Waterfalls is one of the best places to visit in Vizag for nature lovers or those looking to take a hike in the hills. The entire area is surrounded by lush greenery, and the trickling stream offers a stark contrast to the black and brown rocks that it hits. Use the staircase for the climb to arrive at a gorgeous view of the surroundings."
                , 18.279214, 82.9900943));
        //INS Kursura Submarine Museum
        hangoutItemArrayList.add(new HangoutItem(R.drawable.kurusura, "INS Kursura Submarine Museum", "Old Monument",
                "The INS Kurusura submarine museum at RK beach is the first submarine turned into a museum in the whole of Asia and second in the world. Various parts of the submarine like the radar room, sonar room, control room, and the weapons used during war are in display in this museum."
                , 17.7172461, 83.3279065));
        //VUDA Park
        hangoutItemArrayList.add(new HangoutItem(R.drawable.vudapark, "VUDA Park", "Nature Hotspot",
                "A prominent tourist attraction in Vizag for adventure lovers, the VUDA park is a specialized adventure park in Vizag. It is now called the VRMDA park and has some of the unique experiences like skiing and heli tourism to travellers. The proximity of this park to the Ramakrishna beach invites enormous crowds at all hours of the day."
                , 17.7240894, 83.3373408));
        //Borra Caves
        hangoutItemArrayList.add(new HangoutItem(R.drawable.borracaves, "Borra Caves", "Nature Hotspot",
                "Known by the locals as Borra Guhalu, the Borra Caves of Vizag are one of the most adventurous places to visit in Vizag.  This tourist attraction of Vizag is located in the Ananthagiri Hills of the Araku Valley. The hills rise to a staggering height of 800-1400 m. The Borra Caves are filled with speleothems, stalactites, and stalagmites at an elevation of 705 m themselves."
                , 18.280698, 83.0375105));

        //Rasa
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.rasa, "Rasa", "Chinese, Continental and Indian Cuisines",
                "Rasa, known for good food, from simple to extravagant, we serve global cuisine during lunch and dinner. In sync with the current trends in the food and beverage industry, our chefs bring to the table a mouthwatering delight. Dining at Rasa is as breezy and exciting as everything else around here. Serving the best of tongue tingling delicacies that can satisfy every food lover’s appetite."
                , 17.7233775, 83.3148175));
        //Barbeque Nation
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.barbequenation, "Barbeque Nation", "Barbeque Cuisine",
                "Barbeque nation stands as one of the major barbeque restaurants across the country. They have pioneered the use of barbeque or grill on the table. With ample live counters for exotic meat, kulfi and special one’s set-up for festivals, a meal at Barbeque Nation is usually an affair of pomp and gaiety."
                , 17.717397, 83.3163445));
        //Bamboo Bay
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.bamboobay, "Bamboo Bay", " Indian cuisine sub classified into Andhra, Chettinad, Mughal",
                "Imbued with an East Indian tribal chic ambience courtesy of flamboyant landscaping guru, Bali’s Made Wijaya, this eatery mixes indoor and alfresco dining by candlelight."
                , 17.720986, 83.3353363));
        //Ming Garden
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.minggarden, "Ming Garden", "Chinese Cuisine",
                "The ideal fine dine to treat your taste buds with the carefully crafted Chinese delicacies from the province of Sichuan & select few choices from the Thai. Stir fried, steamed, braissed are just the way you like it. Accompanied by exclusive collection of wines."
                , 17.7116113, 83.3145476));
        //WelcomCafe Oceanic Restaurant
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.welcomcafeoceanic, "WelcomCafe Oceanic Restaurant", "Andhra Cuisines",
                "With the swimming pool as the backdrop, this coffee shop serves the most delectable all day dining menu for breakfast, lunch and dinner. WelcomCafe Oceanic celebrates fresh, seasonal produce from around the world that are crafted with care and expertise to accentuate the natural flavours. Also experience 'WelcomSthalika', the finest selections from the local Andhra cuisine for lunch & dinner."
                , 17.711967, 83.3131873));
        //The Square
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.thesquare, "The Square", "Multi Cuisine",
                "An all-day dining multi-cuisine restaurant. It is extremely popular for its delicacies and its lavish buffet spread for breakfast, lunch and dinner. Also, spacious & brightly lit restaurant serving a Chinese & North Indian buffet menu."
                , 17.7105244, 83.3136606));

        //CMR Shopping Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.cmrmallvizag, "CMR Shopping Mall", "Nehru Nagar, Ram Nagar, Visakhapatnam"
                , "This happens to be the largest and the most reputed of the shopping malls in Vizag and is known for selling high quality products. The mall is known for its premier jewellery and one can buy accessories of all kinds at very affordable rates."
                , 17.7148135, 83.3013742));
        //The Old Book Market
        shoppingItemArrayList.add(new HangoutItem(R.drawable.oldbookmarket, "The Old Book Market", "Daba Gardens, Allipuram, Visakhapatnam"
                , "The old book market is somewhat of a heritage location in the city and is located in Central Vizag. It is a pleasure to see rows and rows of books neatly piled up. There are more than 30 shops and all of them sell academic and non academic books as well as fiction and nonfiction titles."
                , 17.7092363, 83.2915686));
        //Jagadamba Centre
        shoppingItemArrayList.add(new HangoutItem(R.drawable.jagadambacenter, "Jagadamba Centre", "Jagadamba Junction, Visakhapatnam"
                , "The Jagadamba Centre is a market hub and for shopaholics who want everything at the same place, so this is an ideal location to be at. If you are interested in authentic handicrafts then you will not find any other place in Vizag as lovely as this one! The landmark here is the Jagadamba Theatre and it is frequented by both tourists and locals on days when there are performances."
                , 17.7125195, 83.3018983));
        //Lepakshi Handicrafts
        shoppingItemArrayList.add(new HangoutItem(R.drawable.lepakshihandicrafts, "Lepakshi Handicrafts", "Jagadamba Junction, Visakhapatnam"
                , "This handicraft store is managed by the Andhra Government and is known for its handcrafted goods. Apart from the local items, one can also find handcrafted goods from other states which are imported here. The most popular picks are figurines and statues of animals, Gods and decorative items for the home like lampshades and vases."
                , 17.7106854, 83.3002461));
        //Kurupam Market
        shoppingItemArrayList.add(new HangoutItem(R.drawable.kurupammarket, "Kurupam Market", " Kurupam Market Centre., Visakhapatnam"
                , "Gold and silver jewellery stores line alongside the thoroughfares here and designs offered are highly traditional and authentic. Many jewellery designers from across the country also showcase their creations here."
                , 17.6995709, 83.2949976));
        //Lifestyle Stores
        shoppingItemArrayList.add(new HangoutItem(R.drawable.lifestylevizag, "Lifestyle Stores", "Opposite Circuit House, Visakhapatnam"
                , "Lifestyle is India's leading fashion destination for the latest trends. Part of Dubai based retail and hospitality conglomerate - The Landmark Group, Lifestyle brings multiple categories including men, women and kids’ apparel, footwear, handbags, fashion accessories and beauty under the convenience of a single roof."
                , 17.7208064, 83.311655));

        //The Dutch Cemetery
        monumentsItemArrayList.add(new HangoutItem(R.drawable.dutchcemetryvizag, "The Dutch Cemetery", "Jagadamba Junction, Visakhapatnam"
                , "The Dutch Cemetery buried in the lanes and bylanes of old Vizag dates back to 1659. Here, there are memorials of those who died during the French War. The Dutch Cemetery houses the memorials of Settlement Chief Charles Simpson, Alexander of Paris amongst others."
                , 17.7143378, 83.2984599));
        //Hawa Mahal
        monumentsItemArrayList.add(new HangoutItem(R.drawable.hawamahalvizag, "Hawa Mahal", "Krishna Nagar, Maharani Peta, Visakhapatnam"
                , "Vizag has one, a grand edifice facing the sea on Beach Road. This rich heritage site, once a historical palace, is still being put to use as a popular venue for many civic events. The grand symmetrical heritage structure overlooking the sea is a tourist attraction that and hosts a number of art exhibitions and events."
                , 17.7073879, 83.3096246));
        //The Victorian Town Hall
        monumentsItemArrayList.add(new HangoutItem(R.drawable.victoriatownhallvizag, "The Victorian Town Hall", "Port Area, Visakhapatnam"
                , "The Victoria Town Hall was built by Maharaja of Bobbili in 1893 to commemorate the Diamond Jubilee of Queen Victoria and handed over to the municipality in 1904. This symmetrical structure is situated on a widely spread hillock, well above sea level, and with an excellent view of the harbour. This is a double storey pitched roof structure."
                , 17.697419, 83.2962946));
        //Bavikonda
        monumentsItemArrayList.add(new HangoutItem(R.drawable.bavikonda, "Bavikonda", "Kapuluppada, Visakhapatnam"
                , "Bavikonda is a hill on the North west of Timmapuram is situated in between Visakhapatnam and Bheemunipatnam Beach road and located at 2 Kms. Interior from the beach road point. On the hill noticed a Buddist site in the middle of the plain with antiquities."
                , 17.8177175, 83.3887695));
        //The Collectorate
        monumentsItemArrayList.add(new HangoutItem(R.drawable.thecollectoratevizag, "The Collectorate", "Krishna Nagar, Maharani Peta, Visakhapatnam"
                , "The Collectorate Building was constructed between 1865 and 1914. A magnificent symmetrical stone E-shaped structure with pyramidal roofs, the Collectorate has two courtyards, a central buttressed porch with semicircular arch openings. The porch has a huge circular buttress on one side, as a watchtower, with a spiral staircase inside it. There is an elegant looking central bay window above the arch opening of the porch. The roof of the ground floor is supported on wooden rafters resting on steel I-sections."
                , 17.7069774, 83.3080506));
        //The King George Hospital
        monumentsItemArrayList.add(new HangoutItem(R.drawable.kinggeorgehospitalvizag, "The King George Hospital", "Maharani Peta, Visakhapatnam"
                , "The King George Hospital (KGH) has been an icon of medical assurance for Vizag and its surrounding areas right since the day it opened its doors in 1923. The main building is a monumental structure, built around 1845 on a 35-acre land donated by the Budhavarapu family. Some of the buildings were constructed by the Bobbili royal family."
                , 17.7087374, 83.3038498));

        addcityitem(R.drawable.visakhapatnam, "Visakhapatnam", "Visakhapatnam is a port city and industrial center in the Indian state of Andhra Pradesh, on the Bay of Bengal. It's known for its many beaches, including Ramakrishna Beach.",
                "25 C", "clear Sky", 93, R.drawable.visakhapatnam, 17.7389495, 83.1225035
                , funfactsVishakhapatnam, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addjaipur() {
        ArrayList<FunFactItem> funfactsJaipur = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsJaipur.add(new FunFactItem("Created in 1726, Jaipur is considered India’s first “planned” city in the Common Era. Jaipur was conceived and constructed in a single phase. Jaipur is one of the few places where the city walls, gates, and major monuments remain in their original condition today. Metro rail lines were built underground so the system would not disrupt the historical architecture. The city was listed as a UNESCO World Heritage Site in July 2019."
                , R.drawable.jaipurfunfact1));
        funfactsJaipur.add(new FunFactItem("Jaipur is popularly known as the Pink City of Rajasthan, which is not only Pink but also the most colorful city of India. The city is the mixture and combination of Indian culture and modern experiences. Jaipur is probably the first planned city of India. It was planned to design in Pink color, as the color signs for hospitality. The city is known to give an unending experience to the tourist as well as the localities.",
                R.drawable.pink_city));
        funfactsJaipur.add(new FunFactItem("Hawa Mahal was built without foundation.  In fact, it is the tallest building in the world without a foundation.  The five-storey building managed to maintain upright because of it is curved shaped.  Just another masterpiece of Rajput and Mughal architecture.The word “Hawa” means wind or breeze and “Mahal” is palace.  So Hawa Mahal is the palace of breeze.",
                R.drawable.hawamahal));

        //Jal Mahal
        hangoutItemArrayList.add(new HangoutItem(R.drawable.jalmahal, "Jal Mahal", "Old Monument",
                "Jal Mahal, as per the name suggests is the water palace in Jaipur. Its tropical architectural style with a mixture of Rajput and Mughal structures are just amazing to the human sight. It is located in the middle of the Man Sagar Lake and it was built for the royal family to go on a summer gateway. It is best to visit Jal Mahal when it is raining, It looks dreamlike and breathtaking under the night sky."
                , 26.9534682,75.8439493));
        //Jantar Mantar
        hangoutItemArrayList.add(new HangoutItem(R.drawable.jantarmantar, "Jantar Mantar", "Old Monument",
                "Jantar Mantar is an astronomical observatory founded by Maharaja Jai Singh II. Day and month were detected with the help of the astronomical device found here following the shadows and the position of the sun. This is declared as a UNESCO World Heritage Site."
                , 26.924762,75.8223713));
        //Chokhi Dhani
        hangoutItemArrayList.add(new HangoutItem(R.drawable.chokidhani, "Chokhi Dhani", "Cultural Place",
                "If you are looking forward to experiencing the Rajasthani culture, Chokhi Dhani is the place. It has the energetic ambiance of Rajasthani village where one can explore the magic show, puppet show, folk performances, camel rides, elephant rides and much more activities with authentic Rajasthani food. Chokhi Dhani gives a nice break from city life to homely rural life."
                , 26.7529749,75.8192919));
        //City Palace
        hangoutItemArrayList.add(new HangoutItem(R.drawable.citypalacejaipur, "City Palace", "Old Monument",
                "The City Palace located in the city. While exploring the palace do find two huge silver urns. They were made by Maharaja Sawai Singh II to carry drinking water of Ganga river while his visit to England. Also, do visit popular Govind Dev Ji’s temple. As per the belief, it is said that the image of Lord Krishna is the same as how he used to look while his reincarnation on Earth."
                , 26.9229115,75.8120959));
        //The Rajput Room – Taste The Royalty
        hangoutItemArrayList.add(new HangoutItem(R.drawable.jaipurres, "The Rajput Room – Taste The Royalty", "Famous Restaurant",
                "Just like Rajasthan without royalty is incomplete, without The Rajput Room the list of best restaurants in Jaipur is lacking. When visiting the numerous tourist places in Jaipur, don’t forget to delight your taste buds with the appetizing selection of Asian and Continental dishes served in this Rambagh Palace restaurant, Jaipur that help unwinding from the stress of everyday drudgery."
                , 26.89836,75.8062663));
        //Ranthambore National Park
        hangoutItemArrayList.add(new HangoutItem(R.drawable.ranthamborenationalpark, "Ranthambore National Park", "National Park",
                "Ranthambore National Park was the hunting ground of the Maharajas of Jaipur. One can spot tigers, bears and go on bird watching tours to get your adventures self out. Also, Dastkar Craft Centre has a nice collection of handicrafts to buy. Hence, Jaipur visit is incomplete without Ranthambore National Park. Distance between Jaipur and Ranthambore National Park is about 180 km. Ranthambore is famous for its wildlife tours and exploration of flora and fauna."
                , 26.0288382,76.4240818));

        //Jaipur Adda
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.jaipuradda, "Jaipur Adda", "Finger Food Cuisine",
                "With new Cafés opening in every nook and corner of the city, Jaipur no longer sticks to the monotony of fine dining, and experimenting with the themes of the restaurants is the new trend.Jaipur Adda is among the many famous restaurants in Jaipur that allow you to feel the wind in your hair while you devour mouth-watering food. But what sets this place apart is its cheery interiors, magnificent wall art and fine wood furniture that adds a royal feel to the whole experience."
                , 26.9211623,75.7926459));
        //RJ 14
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.rj, "RJ 14", "North & South Indian Cuisine",
                "A true delight for the lovers of Indian cuisine, this is unmistakably the best vegetarian restaurant in Jaipur. Apart from being a veggie lover’s paradise, the charming interiors of this quaint restaurant are breathtaking and enchant with their exceptional beauty. Click some mesmerizing pictures while here for those unending likes and comments! Looking for South Indian fare? You’ll find that this place is nothing less than the best South Indian restaurant in Jaipur."
                , 26.8953078,75.7483683));
        //Taruveda – Creative Interiors
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.taruveda, "Taruveda", "Cafeteria",
                "The appealing decor of this quaint little bistro that is covered in wall murals makes it worth appreciating the creative expression of its owners. Housing not only a bistro but also an organic store and a home store as well, the bright interiors of both the indoors and the outdoors make it feel like home. This fairly new restaurant in Jaipur has quickly made it to the top with its assorted menu that serves sushi, crepes, falafel canape, beetroot hummus, and tofu burgers."
                , 26.9116233,75.7890823));
        //Chao Chinese Bistro
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.chaochinesebistro, "Chao Chinese Bistro", "South Asia Cuisine",
                "One of the best Chinese restaurants in Jaipur, the bistro impresses one with its emphasis on simplicity and flavor. Indulge in an array of authentic Chinese dishes or pick a modern rendition of the traditional recipe from their wide range of selection and gorge on the heavenly taste of Asian food. So to devour the best food in Jaipur, head to Chao Chinese Bistro on your next vacation."
                , 26.9027272,75.790415));
        //Tapri Central
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.tapricentral, "Tapri Central", "Cafeteria & Fast Food",
                "Among the best places to eat in Jaipur, Tapri Central deserves a special mention for its cozy interiors that transform a hangout with friends into a homely affair and the alluring view of Central park mesmerizes one and all with its beauty! It’s among the finest birthday party restaurants in Jaipur with a cool and laid back ambiance to suit everyone’s fancy."
                , 26.9056058,75.8089933));
        //Handi
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.handi, "Handi", "North Indian & Mughlai Cuisine",
                "Proud winner of the “Best North Indian Food Restaurant”, Handi is constantly stealing the hearts of not only locals but also the foreigners who come here for its tantalizing food and lively ambiance! The restaurant’s tagline captures the essence of the ambiance that impresses guests unfailingly. Relish the taste of authentic North Indian and Rajasthani cuisine that makes it one of the best restaurants in Jaipur. When looking for nonvegetarian restaurants in Jaipur for lunch, then don’t forget to try this one!"
                , 26.9094978,75.7969331));

        //Anokhi
        shoppingItemArrayList.add(new HangoutItem(R.drawable.anokhijaipur, "Anokhi", " Ashok Nagar, Jaipur",
                "If you’re an admirer of beautiful bright prints and handcrafted fabrics, then Anokhi will definitely not disappoint you. Holding different chains of stores, this place has made a mark with its distinguished designs, prints and range of colors which makes it one of the best shopping places in Jaipur. So how can you miss this paradise shop while roaming in the city of art and crafts."
                , 22.4211534,73.200065));
        //The Gem Palace
        shoppingItemArrayList.add(new HangoutItem(R.drawable.thegempalace, "The Gem Palace", "Jayanti Market, New Colony, Jaipur"
                , "If you have a thing for antique charms and jewelry, then The Gem Palace is ideal for you. Renowned for the traditional and intricate designs, their jewelry is an epitome of a vast cultural heritage. Each item that they sell speaks for itself. The family-run business has a great legacy that continues to grow till date."
                , 26.9169008,75.8108183));
        //Aravali Bazaar
        shoppingItemArrayList.add(new HangoutItem(R.drawable.aravalibazaar, "Aravali Bazaar", "Prithviraj Road, Jaipur"
                , "If you want to shop for home decor products, then consider Aravali Bazaar. The market is an all-in-one place, known for selling high-quality quilts, bed sheets, stationery, and even clothes. Each item sold here does not cost much. This place can be a paradise for those looking for home-related solutions."
                , 26.9060037,75.7997587));
        //Tripolia Bazaar
        shoppingItemArrayList.add(new HangoutItem(R.drawable.tripoliabazaar, "Tripolia Bazaar", "Kanwar Nagar, Jaipur"
                , "Tripolia Bazaar is known for its lac jewelry and the beautiful varieties of bangles. It is one of the best places to shop in Jaipur for bangles and similar items. Shop for the textiles in Tripolia Bazaar. Flaunt the popular Bandini tie and dye fabrics with rich embroideries are also available here. Since you can also buy designer carpets, brass ware and other traditional wears here, this market can be considered as one of the most amazing places to do shopping in Jaipur."
                , 26.9287808,75.8158667));
        //Chandpole Bazaar
        shoppingItemArrayList.add(new HangoutItem(R.drawable.chandpolbazaar, "Chandpole Bazaar", "Pink City, Jaipur"
                , "Chandpole Bazaar, one of the traditional shopping markets in Jaipur, is where the creativity comes alive; where you can come across handicrafts, carvings made out of marble and other hand-looms. At the Khazanewalon ka Rasta, you can shop for popular pieces like the traditional and flamboyant shoes, pretty handicrafts, perfect sculptures made of wood and stones, carpets, turbans or anything that you absolutely love!"
                , 26.922116,75.8089609));
        //World Trade Park Jaipur
        shoppingItemArrayList.add(new HangoutItem(R.drawable.worldtradepark, "World Trade Park", "Malviya Nagar, Jaipur",
                "The World Trade Park will be built in the heart of the city. It will have offices, a convention centre, retail outlets, exhibition halls, a five-star hotel, a multiplex, trade lobbies, an art gallery and a “computer-controlled” parking for 1,100 vehicles. “With this project, we are venturing into blending tourism and trade."
                , 26.853021,75.8024801));

        //Amer Fort
        monumentsItemArrayList.add(new HangoutItem(R.drawable.amerfort, "Amer Fort", "Devisinghpura, Amer, Jaipur"
                , "Proudly standing on a hilltop with a defensive wall leading to its entrances, the iconic Amer Fort from the 16th century was built by Raja Man Singh and presently is serving as a renowned tourist attraction in Jaipur. Inside the fort are the ancient beauty of palaces, courtyards, and temples. The red and white stone construction of this exquisite fort is of the Indo-Islamic style of architecture. You can reach the fort either by renting a jeep or can even prefer to walk to the fort."
                , 26.9854913,75.8491567));
        //Jaigarh Fort
        monumentsItemArrayList.add(new HangoutItem(R.drawable.jaigarhfort, "Jaigarh Fort", "Devisinghpura, Amer, Jaipur"
                , "Up next is Jaigarh Fort which is popularly known for housing the largest cannon on the wheels – Jaivana Cannon. Jaigarh Fort is comfortably standing atop the Cheel Ka Teela (‘Hill of Eagles’) of Aravali Hills overlooking the Maota Lake and Amer Fort. This construction of this marvellous settlement dates back to the 18th century and was built by Maharaja Sawai Jai Singh II. Spread across 3 km in length and 1 km in breadth, Jaigarh Fort consist temples, residential complexes, and water reservoirs that are still untouched and well-preserved."
                , 26.9816016,75.8425699));
        //Albert Hall Museum
        monumentsItemArrayList.add(new HangoutItem(R.drawable.alberthallmuseum, "Albert Hall Museum", "Kailash Puri, Adarsh Nagar, Jaipur",
                "A Museum is a place wherein you can quench your much of your curiosity. Keeping that in mind, Albert Hall Museum, also known as the State Museum of Rajasthan, imparts you with some fascinating history. Albert Hall Museum is the oldest museum in Rajasthan and is named after King Edward VII, the museum boasts a rare assortment of an intricate armoury, artefacts, stone artwork, royal costumes, metal, and ivory."
                , 26.9115803,75.8172988));
        //Jagat Shiromani Temple
        monumentsItemArrayList.add(new HangoutItem(R.drawable.jaigarhfort, "Jagat Shiromani Temple", "Behind Amer Fort, Amer Rd, Jaipur"
                , "A different yet the most magnificent attraction in the entire list is the Jagat Shiromani Temple. Located in the Amer Town, Jagat Shiromani is the 17th-century temple in Jaipur, dedicated to Lord Krishna. The temple displays a fine art of granite, sandstones, and marbles and its construction boasts a blend of Hindu, Jain, and South Indian styles of architecture making it one of the most visited monuments in Rajasthan."
                , 26.9890642,75.8490827));
        //Chhatris of Gaitore
        monumentsItemArrayList.add(new HangoutItem(R.drawable.chhatrisgaitore, "Chhatris of Gaitore", "Krishna Nagar, Brahampuri, Jaipur"
                , "Some 15 km from Jaipur city centre, there lies a must-visit attraction – Chhatris of Gailore. Renowned as the resting place of royal Rajput family members, Chhatris of Gaitore is a small valley full of sandstone and grand marble cenotaphs, ornamented with intricate carvings, and constructed on elevated platforms making it one of the must-visit tourist attraction in Jaipur."
                , 26.9438876,75.8283235));
        //Amar Jawan Jyoti
        monumentsItemArrayList.add(new HangoutItem(R.drawable.amarjawanjyoti, "Amar Jawan Jyoti", "Jaipur Nagar Nigam, Lalkothi, Jaipur",
                "The Amar Jawan Jyoti in Jaipur was built in order to commemorate the martyrdom and bravery of Jaipur’s soldiers who laid their lives for the sake of country. Located near Vidhan Sabha, this memorial is generally lit up with lights in the evenings and thus attracting people to spend their time here."
                , 26.8957014,75.7977304));


        addcityitem(R.drawable.jaipur, "Jaipur", "Jaipur is the capital of India’s Rajasthan state. It evokes the royal family that once ruled the region and that, in 1727, founded what is now called the Old City, or “Pink City” for its trademark building color. ",
                "25 C", "Clear Sky", 93, R.drawable.jaipurcity, 26.9124, 75.7873
                , funfactsJaipur, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addnagpur() {
        ArrayList<FunFactItem> funfactsNagpur = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsNagpur.add(new FunFactItem("Nagpur is the major exporter of oranges and it is here where you can find acres of land nurturing tones of oranges every month. Therefore, it is sometimes referred to as the Orange City of India."
                , R.drawable.orangecity));
        funfactsNagpur.add(new FunFactItem("Nagpur wasn't a major town in the 19th century, Jamshedji Tata chose to inaugurate the first-ever textile mill in India within its boundaries. The mill was called Central India Spinning and Weaving Company Ltd and started working in the year 1877. It was also known as Empress Mill as it was opened on the day when Queen Victoria was declared the Empress of India."
                , R.drawable.textilemill));
        funfactsNagpur.add(new FunFactItem("Nagpur has a literacy rate of more than 92%, which is actually higher than the likes of Mumbai and Pune. Not only the urban settlement, but the rural region of Nagpur also has a higher literacy rate than those of Mumbai and other significant cities."
                , R.drawable.literacyrate));

        //Deeksha Bhoomi
        hangoutItemArrayList.add(new HangoutItem(R.drawable.deekshabhoomi, "Deeksha Bhoomi", "Old Monument",
                "Bhoomi is a monument with huge whitewashed dome and is the largest stupa in Asia. It was erected in the memory of Dr. Ambedkar and his event of embracing Buddhism; wherein with him, 60000 others had also converted to Buddhism. The bronze statue of Buddha here, along with the sacred tree has made Deeksha Bhoomi one of the famous tourist places in Nagpur."
                , 21.128061, 79.0647553));
        //Umred Karhandla Wildlife Sanctuary
        hangoutItemArrayList.add(new HangoutItem(R.drawable.umredkarhandlawildlifesanctuary, "Umred Karhandla Wildlife Sanctuary", "Wildlife Sanctuary",
                "Home to “Jai” - one of the largest tigers and the only male in the entire sanctuary, Umred Karhandla has become a hub for tourists; especially for nature lovers and photographers. It  is a good option for a one day trip. Other than tigers, animals like Gaur, wild dogs and other rarely found animals like pangolins and flying squirrels are often spotted here which has led to an increase in the numbers of tourists visiting the sanctuary."
                , 20.8465115, 79.3948658));
        //Ambazari Lake & Garden
        hangoutItemArrayList.add(new HangoutItem(R.drawable.ambazarilake, "Ambazari Lake & Garden", "Nature Hotspot",
                "Nagpur is the land of many lakes - 11 to be precise, and Ambazari Lake is one of the most famous tourist places to visit in Nagpur, mainly because it is the largest one in the city. Its mere beauty and size call out for some peaceful time in the lap of nature. Adjacent to the lake, the garden spread across 25 acres of land is like the cherry on top."
                , 21.1311944, 79.0291271));
        //Pench Tiger Reserve
        hangoutItemArrayList.add(new HangoutItem(R.drawable.penchtigerreserve, "Pench Tiger Reserve", "Tiger Reserve",
                "Pench Tiger Reserve is home to 53 tigers. Spreading across two states - Maharashtra and Nagpur, Pench is famous for its flora and fauna. This park certainly qualifies as a must-see amongst all other tourist places in Nagpur. The best part is that there are government as well as private resorts that sort accommodation needs for visitors willing to have an overnight trip. Thus it becomes a great option for a weekend getaway."
                , 21.1156146, 77.4464023));
        //Gorewada Lake
        hangoutItemArrayList.add(new HangoutItem(R.drawable.godewadalake, "Gorewada Lake", "Nature Hotspot",
                "Gorewada Lake along with the dam supporting it can be considered as a full day picnic spot. The waterbody is the main source of water supply for the whole of Nagpur, so has great significance. The lake is surrounded by an abundance of lush green and thick trees, bushes and make for a great landscape."
                , 21.1968747, 79.0278821));
        //Swaminarayan Temple
        hangoutItemArrayList.add(new HangoutItem(R.drawable.swaminarayanmandir, "Swaminarayan Temple", "Old Monument",
                "Well constructed and decorated, Swaminarayan Temple has been meeting devotees from far. The green carpet inside temple premises is soothing to the eyes and adds to the positivity of the environment while the staircase to the temple makes one keep staring in awe. The best time to visit the temple is in evening, post or during sunset when the temple gets fully lit with hues against the dark background of the night sky."
                , 21.1309941, 79.1394203));

        //Naivedhyam
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.naivedhyam, "Naivedhyam", "Vegan South Indian Cuisine",
                "Naivedhyam is nothing short of a classic for the locals in Nagpur. A family place serving some of the best vegetarian food in the entire city at a value for money price, this place has a long list of patrons. It was started way back in 1979 by Raju Kamdar who, taking inspiration from the excellent food served by a small eatery in Dhulia, laid the foundation of Naivedhyam to give the people of Nagpur some really nice food to binge on. Indian, Mexican, Thai, Italian, you name it, Naivedhyam has it all!\n"
                , 21.1903671,79.0249634));
        //The Bukhara
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.bukhara, "The Bukhara", "North Indian & Mughlai Cuisine",
                "Serving a variety of cuisines like Italian, Mughlai, North Indian, Chinese and Thai, the Bukhara is one of the swankiest eateries in Nagpur. You can have a good time with your partner here in a romantic, intimate evening, thanks to the soft and soothing interiors of the restaurant. If you are a die-hard fan of chicken biryani, you will love your time here as their biryani is to die for. The place also houses a full bar where you can have cocktails, shooters quenchers, beers, wines, and more. The sheer variety of dishes is what makes the Bukhara an instant hit among foodies."
                , 21.1400868,79.0778466));
        //Mustard Restro Lounge
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mustard, "Mustard Restro Lounge", "Multi Cuisine",
                "Mustard Restro Lounge is a fine dining place you can visit with your friends and family. Boasting of a great ambiance, this place is also owned by the famous Bawarchi group. Good service along with a great taste in food, Mustard Restro Lounge can be your destination for next weekend to chill at."
                , 21.1564604,79.0790416));
        //Chill N Grill
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.chillgrill, "Chill N Grill", "Multi Cuisine",
                "A new age restaurant where you can enjoy the skyline of Nagpur with its roof-top setting, Chill N Grill has a varied menu. You can choose from a great range of Chinese, Thai, Continental and North Indian dishes and devour your meal while enjoying sports and music on a big screen. Great quality of food, amazing ambiance, and cool décor make this place a great option to hang out during weekends. Chill N Grill, as the name suggests, boasts of young and joyful vibes."
                , 21.1598903,79.0778893));
        //Fountain Sizzlers & Bistro
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.fountainsizzlers, "Fountain Sizzlers & Bistro", "Multi Cuisine",
                "No culinary scene in a city is complete without a dedicated place that serves lip-smacking sizzlers and for Nagpur, Fountain Sizzlers & Bistro (popularly known as FSB) is THAT place! A serene and classy place to go to for catching up on your continental cravings, the place is always bustling with crowds. It is a great place to have a sizzler at any point of time and the menu here is a mixture of continental and Italian fare with a few Indian dishes as well. Go for a plate of rich, flavorsome lasagne, Thai Sizzler or Lebanese Mezze Platter, the choice is yours!"
                , 21.1385657,79.0781617));
        //Indiya Oye
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.indiyaoye, "Indiya Oye", "North India Cuisine",
                "Indiya Oye represents the bold and exotic flavors of India with an unforgettable combination of fine cuisine, warm decor, and personal service. Discover the rich heritage of the subcontinent as you sample authentic favorites like chaats and a variety of regional desserts."
                , 21.1059258,79.0671601));

        //Fortune Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.fortunemall, "Fortune Mall", "Buty Marg, Sitabuldi, Nagpur",
                "Fortune Mall is one of the most famous malls in Nagpur. Apart from showcasing multiple brands and having a prominent food court, Fortune mall is the hub of all major events, be it beauty pageants or a music fest. Fortune mall also boasts of its lavish food court, which is a famous hang-out destination for many."
                , 21.1408107,79.0798847));
        //Poonam Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.poonammall, "Poonam Mall", "Ramdaspeth, Nagpur"
                , "Poonam mall is the first multiplex and mall in Nagpur. It was built by N.Kumar Group, to acquaint the people of Nagpur to the mall culture. The mall is in the heart of the city. Its showcases brands like Archies, Big Bazaar, etc. and has an entertainment zone named Amoeba. Its main attraction is Inox multiplex, which is the most sought after the theatre in the city."
                , 21.1351222,79.0606029));
        //Trillium Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.trilliummall, "Trillium Mall", "Untkhana, Nagpur"
                , "It houses a variety of brands including national brands like Manyavar Mohey, Forest Essentials, Lifestyle and international brands like H&M, Nautica, Van Heusen and more. The Cinepolis multiplex in Trillium mall is quite popular. Trillium mall in Nagpur symbolizes a perfect shopping, food and entertainment experience."
                , 21.1326948,79.0938568));
        //Empress Mall
        shoppingItemArrayList.add(new HangoutItem(R.drawable.express, "Empress Mall", "Empress City, Nagpur"
                , "Empress Mall is one of the leading shopping malls situated in Nagpur. It covers all the basic needs and requirements to keep you on the trends and latest collections. The mall provides a modern and refreshing environment to make your shopping experience smooth and happy. The mall has national and international brands, multiplex and food court. "
                , 21.1479731,79.0913983));
        //Nagpur Central
        shoppingItemArrayList.add(new HangoutItem(R.drawable.nagpurcentral, "Nagpur Central", "Ramdaspeth, Nagpur"
                , "Nagpur Central is a mall for fun-loving people leading an energetic and vibrant lifestyle. It offers the latest in fashion and accessories from over 1000 brands. The mall provides a holistic shopping experience with different features. The mall offers a wide selection of accessories and fashion apparel at a great value."
                , 21.1372702,79.0642845));
        //VR Nagpur
        shoppingItemArrayList.add(new HangoutItem(R.drawable.vrnagpur, "VR Nagpur", "Untkhana, Nagpur",
                "V R Nagpur Vision Infrastructure in Baidyanath Chowk, Nagpur is a top player in the category Land Developers in the Nagpur. It is known to provide top service in the following categories: Land Developers, Land Developers For Plot."
                , 21.1328363,79.0946685));

        //Deeksha Bhoomi
        monumentsItemArrayList.add(new HangoutItem(R.drawable.deekshabhoomi, "Deeksha Bhoomi", "Nagpur"
                , "Deekshabhoomi is a sacred monument of Navayana Buddhism located at Nagpur city in Maharashtra state of India; where B. R. Ambedkar, embraced Buddhism with approximately 600,000 of his followers mainly scheduled caste peoples on Ashoka Vijaya Dashami on 14 October 1956. Ambedkar revived Buddhism in India."
                , 21.128056,79.0647553));
        //Zero Mile Stone
        monumentsItemArrayList.add(new HangoutItem(R.drawable.indiazeropoint, "Zero Mile Stone", "Civil Lines, Nagpur"
                , "Zero Mile Stone is a monument built by British during the Great Trigonometrical Survey of India in 1907 in Nagpur, Maharashtra. The Zero Mile Stone consists of a pillar made up of sandstone and another small stone representing the GTS Standard Bench Mark, and four stucco horses that were added later."
                , 21.1497455,79.0785283));
        //Ramtek Fort Temple
        monumentsItemArrayList.add(new HangoutItem(R.drawable.ramtekforttemple, "Ramtek Fort Temple", "Ramtek, Nagpur",
                "Away from the city crowd, situated inside a fort on a hilltop, this temple is a source of rich mythological history. It is believed that Lord Rama took rest in this temple before leaving to conquer Lanka therefore making Lord Rama the main deity to be worshipped here."
                , 21.3984397,79.3313345));
        //Akshardham Temple
        monumentsItemArrayList.add(new HangoutItem(R.drawable.akshardham, "Akshardham Temple", "Mahesh Nagar, Nagpur"
                , "Swaminarayan Temple or Akshardham Temple is located on the Ring Road in Nagpur. The newly constructed temple is facilitated with a huge kitchen, parking, a restaurant and a kids play area. It is advised to visit the temple after 4 in the evening owing to its impressive lighting and decor. The temple is spread over two floors and boasts of a striking architecture."
                , 21.1373936,79.0053932));
        //Bohra Masjid
        monumentsItemArrayList.add(new HangoutItem(R.drawable.bohramasjid, "Bohra Masjid", "Itwari, Nagpur"
                , "Mostly worshipped by the Dawoodi Bohra community of Nagpur, the architecturally beautiful mosque is mainly used for community gatherings and weddings."
                , 21.1557206,79.1036304));
        //Narrow Gauge Rail Museum
        monumentsItemArrayList.add(new HangoutItem(R.drawable.narrowgaugemuseum, "Narrow Gauge Rail Museum", "Mohan Nagar, Nagpur",
                "The museum has models and lookalikes of locomotives, trains, steam engines and the like. Besides, the premises also have an amusement park, toy trains and swings for kids."
                , 21.1663552,79.0880178));

        addcityitem(R.drawable.nagpur, "Nagpur", "Nagpur is a large city in the central Indian state of Maharashtra. The 19th-century Nagpur Central Museum displays items found locally, including fossils, sarcophagi and Mughal weaponry.",
                "25 C", "clear Sky", 93, R.drawable.nagpur, 21.1612315, 79.0024694
                , funfactsNagpur, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }

    public void addsurat() {
        ArrayList<FunFactItem> funfactsSurat = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsSurat.add(new FunFactItem("Surat is Ranked 3rd Cleanest City in India. From its streets to its markets, public transport to residential areas, you find the residents and administration putting efforts to maintain cleanliness. Also, the fact that the railway station of Surat was awarded the cleanest railway station title in 2016 demonstrates this fact.",
                R.drawable.suratcity));
        funfactsSurat.add(new FunFactItem("Surat city is credited to have the maximum number of flyovers in the country, which makes the movement of traffic within the city smooth. You can take public or private transport to commute from one place to another. Both modes of transport are comfortable and affordable here. Surat City Bus service runs on a public-private partnership model providing quality transport experience to locals as well as visitors.",
                R.drawable.suratflyover));
        funfactsSurat.add(new FunFactItem("Surat is the World’s Largest Diamond Cutting & Polishing Hub.  If you want to buy diamond jewellery, there cannot be any other place than Varachha or Mahidharpura market to look for best designs and competitive price. Ask for any cut, colour or clarity, and you get finest of designs at the jewellery stores here. You can also get customized diamond jewellery in a short time period from the stores at these markets.",
                R.drawable.suratdiamond));

        //Amaazia Water Park
        hangoutItemArrayList.add(new HangoutItem(R.drawable.suratamaazia, "Amaazia Water Park", "Water Park",
                "Fairytale dreams come true not only for children but for adults too. At Amaazia,a project by Rajgreen group and India's first indoor integrated amusement park fantasy becomes a reality as you explore the tidal wave of fun to a tropical paradise in our waterpark, experience the thrill of our world class theme park rides and various entertainment joints under one single roof."
                , 21.1945138,72.8628476));
        //Surat Castle
        hangoutItemArrayList.add(new HangoutItem(R.drawable.suratcastle, "Surat Castle", "Old Monument",
                "Surat Castle is also known as the ‘Old Fort’, one of the best tourist places in Surat. It was built by the Gujarat’s Sultanate on the basis of Ferozkhan Tughlaq of Delhi Sultanate. The main purpose of this fort was to safeguard against the Portuguese. Now, it is one of the most popular historical monuments in the city."
                , 21.1841867,72.7900645));
        //Jagdishchandra Bose Aquarium
        hangoutItemArrayList.add(new HangoutItem(R.drawable.surataquarium, "Jagdishchandra Bose Aquarium", "Aquarium",
                "Jagdish Chandra Bose Aquarium is situated in the Pal area of Surat, Gujarat, India. It is the first multidisciplinary underwater aquarium of its kind in the country and named after the Bengali scientist Jagadish Chandra Bose. The aquarium will be the home of more than 100 species of fish, from fresh, brackish and marine waters, in 52 tanks. Aquascaping is underway as per the species' requirements, and each tank will replicate a collection of species' natural ecosystem."
                , 21.1842, 72.7923));
        //Gopi Talav
        hangoutItemArrayList.add(new HangoutItem(R.drawable.gopitalav, "Gopi Talav", "Nature Hotspot",
                "Gopi Talav is a lake in the Gopipura locality in Surat. It was built in circa 1510 CE by Malik Gopi, who was an affluent merchant and governor of Surat during the Mughal Empire. In 2012, the lake was renovated by Surat Municipal Corporation and the area surrounding it was redeveloped as a recreational facility."
                , 21.1885633,72.827201));
        //Dumas Beach
        hangoutItemArrayList.add(new HangoutItem(R.drawable.surat2, "Dumas Beach", "Beach",
                "Dumas Beach is an rural beach along the Arabian Sea, located 21 kilometres (13 mi) southwest of the City of Surat in the Indian state of Gujarat. It is a popular tourist destination in South Gujarat. Dumas Beach is justly famous for being in the top 35 haunted spots in India. Dumas beach is known for its black sand and is considered to be haunted; because it was once used as a Hindu burial site, according to folklore."
                , 21.0864516,72.7031313));
        //Sarthana Nature Park
        hangoutItemArrayList.add(new HangoutItem(R.drawable.suratnationalpark, "Sarthana Nature Park", "National Park",
                "Sarthana Nature Park is a zoological garden located in Surat, Gujarat, India, owned and managed by Surat Municipal Corporation. This is the largest zoological garden of the state and one of the oldest zoological parks of Gujarat, spread over the 81 acres with river Tapi on the north side and Surat Kamrej road is on its south side. The zoo was established in 1984, the first zoo in South Gujarat region and Gujarat's breeding center."
                , 21.2303193,72.896579));

        //Level 5 Terrace Restro
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat10, "Level 5 Terrace Restro", "All cuisines",
                "Vegetarian Friendly, Vegan Options, Gluten Free Options",
                21.1860371, 72.7921654));
        //Blue Coriander
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat11, "Blue Coriander", "All cuisines",
                "Vegetarian Friendly, Vegan Options, Gluten Free Options",
                21.7522958, 72.8383756));
        //Barbeque Nation
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat12, "Barbeque Nation", "All cuisines",
                "Vegetarian Friendly, Vegan Options, Halal, Gluten Free Options",
                21.171228, 72.7871342));
        //Leonardo Italian Mediterranean Dining
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat13, "Leonardo Italian Mediterranean Dining", "Italian Cuisine",
                "Vegetarian Friendly, Vegan Options, Gluten Free Options",
                21.1616208, 72.7725407));
        //Sasumaa Gujarati Thali
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat14, "Sasumaa Gujarati Thali", "Asian Cuisines",
                "Vegetarian Friendly, Vegan Options, Gluten Free Options",
                21.18306, 72.8127258));
        //Ziyafat Restaurant
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.ziyafatsurat, "Ziyafat Restaurant", "Vegan Cuisine",
                "Ziyafat Restaurant(Hotel In Surat) you can find the best food of Surat. The ambience of the hotel adds up to the royal experience."
                , 21.204916,72.8364312));

        //Sahara Darwaja
        shoppingItemArrayList.add(new HangoutItem(R.drawable.surat15, "Sahara Darwaja", "Begampura ,Surat",
                "Sahara Darwaja is popular for its textile market and considered as the best shopping place in Surat, especially for ladies. You will find many manufacturers as well as wholesalers of textiles and sarees in this market.",
                21.1912387, 72.8389585));
        //Shanivari Market
        shoppingItemArrayList.add(new HangoutItem(R.drawable.surat16, "Shanivari Market", "Chowk Bazar, Surat",
                "Shanivari market, located near Makai Pul is the place where all the home décor and antique lovers go. The only thing that you need to remember while making your plan for this market is that it is open only on Saturdays.",
                21.1959545, 72.816397));
        //Old Bombay Market
        shoppingItemArrayList.add(new HangoutItem(R.drawable.surat17, "Old Bombay Market", "Umarwada, Surat",
                "Just like Sahara Darwaja, Old Bombay market is also one place where you will come across wide range of textiles. It is one of the best places for wedding shopping in Surat, where you will get a wide variety of top-notch quality clothing at wholesale prices.",
                21.1993278, 72.8497017));
        //Rander Road
        shoppingItemArrayList.add(new HangoutItem(R.drawable.surat18, "Rander Road", "Rander Road, Surat",
                "Rander road is another textile market in Surat that you may want to visit. The gorgeous designer dresses available here can be purchased at the most reasonable prices",
                21.2070983, 72.7950468));
        //Chauta Bazaar
        shoppingItemArrayList.add(new HangoutItem(R.drawable.surat19, "Chauta Bazaar", "Chauta Pul",
                "This is one of the most popular shopping places in Surat, which also happens to be the oldest market in the city. From clothes to cosmetics, from utensils to grocery, everything is available at this market.",
                21.1982573, 72.823563));
        //VR Surat
        shoppingItemArrayList.add(new HangoutItem(R.drawable.vrmallsurat, "VR Surat", "Magdalla, Surat",
                "VR Surat is Virtuous Retail South Asia’s flagship destination and is a first-of-its-kind, community-oriented integrated lifestyle destination. Spread over 615,000 sq. ft. the Centre has established itself as Surat’s only destination that offers a curated mix of local and global programmes in the fields of retail, food, music, art, culture and entertainment.",
                21.1451737,72.7548968));

        //Surat Castle
        monumentsItemArrayList.add(new HangoutItem(R.drawable.surat20, "Surat Castle", " Makkai Pull, Chowk Bazar, Surat",
                "This defensive fortress was constructed in the 16th century by Sultan Mahmood III.",
                21.1960961, 72.8155234));
        //Sardar Patel Museum
        monumentsItemArrayList.add(new HangoutItem(R.drawable.surat21, "Sardar Patel Museum", "Swamy Dayananad Sagar Marg, Chowk Bazar, Gopipura",
                "Established in 1890, Sardar Patel Museum contains great rich history of Surat and is dedicated to Sardar Vallabhai Patel, the iron man of India.",
                21.1959311, 72.802085));
        //Surat Clock Tower
        monumentsItemArrayList.add(new HangoutItem(R.drawable.surat22, "Surat Clock Tower", "Navapura Karwa Road, Kumbharwada, Navapura, Begampura",
                "The clock tower was built by Khan Bahadur Burjorjee Hormusjee Fraser as a tribute to his father in the year 1871. ",
                21.1975768, 72.8296878));
        //Andrew’s Library
        monumentsItemArrayList.add(new HangoutItem(R.drawable.surat23, "Andrew’s Library", "Chowk Bazar Road, Nanavat, Gopipura",
                "Established in 1850, Andrew’s library is the old library in Surat which is quite popular among students from commerce, science, engineering and medical fields due to its rare works in arts and history.",
                21.196941, 72.8168732));
        //Dutch and Armenian Cemetery
        monumentsItemArrayList.add(new HangoutItem(R.drawable.surat24, "Dutch and Armenian Cemetery", "Katargam Road, Rampura, Raman Nagar, Katargam Darwaja",
                "The monuments consist of Dutch tombs of various sizes and shapes which are relatively larger than the Armenian graves, the largest among which is the grandiose mausoleum of Baron Adrian Van Reede, who was the Director of the Dutch Company in the Indies.",
                21.2093335, 72.8251347));
        //Narmad House
        monumentsItemArrayList.add(new HangoutItem(R.drawable.surat25, "Narmad House", "Gopipura, Surat",
                "The house is a prominent historical place in Surat where the great poet, writer, and social reformer, Narmad lived. The house was restored into a museum by the Surat Municipal Corporation consisting of 2 floors. People visit the museum to cherish the stellar pieces of history, art, and literature left behind by Narmad.",
                21.1950529,72.8255957));

        addcityitem(R.drawable.surat, "Surat", "Surat is a large city beside the Tapi River in the west Indian state of Gujarat. Once known for silk weaving, Surat remains a commercial center for textiles, and the New Textile Market area is lined with fabric shops",
                "25 C", "clear Sky", 93, R.drawable.surat4, 21.1591857, 72.7522558
                , funfactsSurat, hangoutItemArrayList, restuarentsItemArrayList, shoppingItemArrayList, monumentsItemArrayList);
    }
}
