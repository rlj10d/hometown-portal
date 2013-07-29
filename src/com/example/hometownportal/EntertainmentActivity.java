/**
 * 
 * EntertainmentActivity.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the Entertainment Activity.
 * Currently this includes Parks, Nightlife, and Arts.
 * 
 */

package com.example.hometownportal;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class EntertainmentActivity extends Activity {
	
	private TextView text;
	private Spinner spinner;
	private static ArrayList<EntertainmentList> parks;
	private static ArrayList<EntertainmentList> nightlife;
	private static ArrayList<EntertainmentList> arts;
	BitmapFactory.Options o;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.entertainment_activity);
		
		text = (TextView)findViewById(R.id.shops);
		spinner = (Spinner)findViewById(R.id.entertainmentSpinner);
		
		text.setText("Panama City is home to top notch attractions and entertainment. Make a selection below to start the fun!"); 
		
		o = new BitmapFactory.Options();
		o.inPurgeable = true;
		o.inInputShareable = true;
		
		parks = new ArrayList<EntertainmentList>();
		nightlife = new ArrayList<EntertainmentList>();
		arts = new ArrayList<EntertainmentList>();
		
		// populate the lists with data
		populateParks();
		populateNightlife();
		populateArts();

	}
	
	private void populateArts() {

		arts.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.grandtheatre, o),
				"The Grand Theatre",
				"850-233-4835",
				"500 S. Pier Park Dr, Panama City Beach, FL 32413",
				"Movie Theatre",
				"Wall to Wall Screens, Stadium Seating, 3D Capabilities, Digital Sound, High Back Rocking Chairs, " +
				"Game Room,  Free Refill Lg Corn & Lg Drink",
				"http://www.thegrandtheatre.com/"));
		
		arts.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.ripleys, o),
				"Ripley's Believe It or Not! Odditorium",
				"850-230-6113",
				"9907 Front Beach Road, Panama City Beach, FL 32407",
				"Museum",
				"Explore the amazing world of Robert Ripley in this one of a kind Odditorium. You'll see amazing exhibits, " +
				"unusual art and genuine artifacts from around the world. Over 400 exhibits are on display in 13 differently " +
				"themed galleries. You can also experience Ripley's 4D Moving Theater located in the building as well. " +
				"This simulated coaster ride puts you right in the middle of the action without the actual upside down " +
				"and drop actions. It is Panama City Beaches coolest experience!",
				"http://www.ripleys.com/panamacitybeach/"));
		
	}

	private void populateNightlife() {

		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.backdoor, o),
				"Backdoor Lounge",
				"850-234-2427",
				"7800 Front Beach Rd, Panama City Beach, FL",
				"Bar",
				"The Back Door Lounge is the newest in the Ms. Newbys family. Offering live music, karoke, good times making " +
				"it an adventure! Come try our world famous Hunch Punch! A lot of time and work is devoted to keeping up with " +
				"the demand for this famous drink. People come to Newby’s from all over to get the drink and our special " +
				"Hunch Punch cups which have been spotted in places around the world such as England, Germany, Iraq, " +
				"Afghanistan and the top of Mt. Fuji in Japan.",
				"http://www.msnewbys.com/"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.stock, o),
				"Beach House Bar & Grill",
				"850-230-1977",
				"19952 Front Beach Rd., Panama City Beach, FL 32413",
				"Bar & Grill",
				"Beach House Bar and Grill is in the middle of Panama City Night life.  It is serving you great food right " +
				"on the beach and is conveniently open all year around. Great live music on the weekends! When you're looking " +
				"for a good meal packed with a good time, then you are looking for Beach House Bar and Grill. "));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.bluewaters, o),
				"Blue Water's Lounge",
				"850-236-4529",
				"7105 Big Daddy Dr., Panama City Beach, FL 32407",
				"Bar",
				"Best bar on the beach! Weekly happy hour, Happy Hour: Monday - Friday, 4-6 p.m. Friday nights heats " +
				"up with Karaoke starting at 8:00 p.m. Blue Water's is by far the the friendliest, cleanest bar in town!"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.lavela, o),
				"Club La Vela",
				"850-235-1061",
				"8813 Thomas Dr., Panama City Beach, FL 32408",
				"Nightclub",
				"Club La Vela is not only the largest nightclub in the USA, it is also one of the trendiest and most respected " +
				"nightclubs in the world. As such, Club La Vela has to continuously reinvent itself to stay on the cutting " +
				"edge of entertainment and club life. By doing so Club La Vela adds new theme rooms on a yearly basis to " +
				"its already huge arsenal of on site clubs all of which are located under one roof! Each theme room has its " +
				"own atmosphere, ambiance, feel, and audience. 11 theme rooms, 48 bar stations, 6000+capacity. Concerts, " +
				"themed parties, teen nights and the best nightclub around, Club La Vela has it all.",
				"http://clublavela.com/"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.coyoteugly, o),
				"Coyote Ugly",
				"850-236-5965",
				"10512 Front Beach Rd., Panama City Beach, FL 32407",
				"Nightclub",
				"We party every night until 4am no matter what! Coyote Ugly provides the best entertainment on the beach " +
				"for local and visitors alike! Great times, great people and plenty of Ugly entertainment!",
				"http://www.coyoteuglysaloon.com/panamacity/"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.stock, o),
				"Donovan's Reef Lounge",
				"850-230-6900",
				"15726 Front Beach Rd, Panama City Beach, FL 32413",
				"Bar",
				"Donovan's Reef provides easy access from the heat right in the heart of Panama City Beach. " +
				"Stop in or carry out, Donovan's has it all."));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.stock, o),
				"Ms. Newbys",
				"850-234-0030",
				"8711 Thomas Dr., Panama City Beach, FL 32408",
				"Bar",
				"Ms. Newbys has been in business for 35 years! Offering live music, karoke, good times " +
				"making it an adventure!",
				"http://www.msnewbys.com/"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.newbystoo, o),
				"Newby's Too",
				"850-234-6203",
				"4103 Thomas Drive, Panama City Beach, FL",
				"Bar",
				"Come try our world famous Hunch Punch! A lot of time and work is devoted to keeping up with the " +
				"demand for this famous drink. People come to Newby’s from all over to get the drink and our " +
				"special Hunch Punch cups which have been spotted in places around the world such as England, " +
				"Germany, Iraq, Afghanistan and the top of Mt. Fuji in Japan. Newby's Too offers pool, dancing, karoke and fun!",
				"http://www.msnewbys.com/"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.buoy, o),
				"The Buoy",
				"850-249-5287",
				"617 Azalea Street, Panama City Beach, FL 32407",
				"Bar, Liquor Store",
				"The Buoy Bar and Liquor Store, stop in or carry out.  \nHappy Hour Monday -Friday 4:00pm-7:00pm " +
				"\nSat-Sunday 12:00pm-4:00pm \nKaroake Fri & Sat. 8P-?"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.saltygoat, o),
				"The Salty Goat Saloon",
				"850-236-7002",
				"13006 Front Beach Rd., Panama City Beach, FL 32407",
				"Bar & Grill",
				"Welcome! You’ve reached the home for the renowned “Red Door Saloon”.  The original Red Door that opened in " +
				"2002 in the Midtown area of Nashville, TN soon proved to be a unique addition to the Music City. \n" +
				"Each Red Door Saloon boasts a full bar, great food, unique decor, exceptional staff & an ambiance you’ll " +
				"instantly take to. So make plans to visit one or all of our locations. “Enjoy, we built these bars for you!”",
				"http://www.thereddoorsaloon.com/locations/panama-city-beach-florida/"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.tooties, o),
				"Tootsie's Orchid Lounge",
				"850-236-3459",
				"700 S. Pier Park Dr, Panama City Beach, FL 32413",
				"Bar, Live Music",
				"Since May 2008, Tootsies Orchid Lounge has been providing the best in county music and great times at " +
				"their latest location in Panama City Beach at Pier Park.",
				"http://www.tootsies.net/"));
		
		nightlife.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.willyslive, o),
				"Willy's Live",
				"850-235-0928",
				"9875 South Thomas Drive, Panama City Beach, FL",
				"Restaurant/Bar, Live Music",
				"You'd be hard pressed to find better drinks, and the staff is as friendly and fun as ever. " +
				"Here you will get the basics: great food, great cocktails, and great staff! Make sure to try the " +
				"signature drink, Pineapply Willy. \nLive music all week long. Check out website for band info! ",
				"http://www.pwillys.com/"));
		
	}

	private void populateParks() {

		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.aaronbessant, o),
					"Aaron Bessant Park",
					"",
					"600 Pier Park Drive, Panama City Beach, FL 32413",
					"Park",
					"Aaron Bessant Park is one of Panama City Beach's newest and most manicured parks. The centerpiece " +
					"of Aaron Bessant Park is a state-of-the-art amphitheater, which hosts world famous musicians as easily " +
					"as local community performances, all just steps from the beach! Located adjacent to Pier Park, the " +
					"70-acre Aaron Bessant Park also features a veterans memorial, 3 looping trails that are great for " +
					"walking (North Loop, South Loop, and Amphitheater Loop), and an open, grassy area that is perfect for " +
					"watching the concert performances or for picnics and throwing the Frisbee in the sun on non-concert days. "));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.camphelen, o),
					"Camp Helen State Park",
					"850-233-5059",
					"23937 Panama City Beach Pkwy., Panama City Beach, FL 32413",
					"State Park",
					"Camp Helen is bordered on three sides by water; the gulf to the south and Lake Powell to the north and " +
					"east. Lake Powell is the largest of the unique coastal dune lakes in Florida. Six communities await your " +
					"exploration and discovery as well a a wealth of local and Florida history! The 183-acre " +
					"park is for day use only. Activities include swimming, beachcombing, bird watching, nature study, hiking " +
					"and biking on the trails, and both freshwater and saltwater fishing.   History Tours are given the " +
					"first Saturday of every month at 10:00AM; free with paid park admission.",
					"http://floridastateparks.org/camphelen/default.cfm"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.cobra, o),
					"Cobra Adventure Park",
					"850-235-0321",
					"9323 Front Beach Rd., Panama City Beach, FL 32407",
					"Amusement/Entertainment Park",
					"Rides at the Cobra Adventure Park include the Max Flight Simulator, billed as the " +
					"“roller coaster of the future.” The Dragon Wagon is a steel-track, junior oval “kids " +
					"only” roller coaster. You can also race 9hp go-karts on four levels at The Cobra, " +
					"(double riding is available for kids,). New at Cobra Adventure Park is our 18 hole pirate " +
					"mini course the Smuggler's Cove where you can have fun playing mini golf in our pirate " +
					"themed course including pirate town, ship and gallows.",
					"https://www.facebook.com/CobraAdventurePark"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.coconutcreek, o),
				"Coconut Creek Family Fun Park",
				"850-234-2625",
				"9807 Front Beach Rd., Panama City Beach, FL 32407",
				"Mini Golf",
				"Welcome to Coconut Creek Family Fun Park, a great place for children and adults. Our tropical " +
				"island theme is complete with cascading waterfalls and a lake with native fish. The park’s " +
				"beautiful landscaping provides the perfect setting to enjoy our two, 18-hole Mini–Golf courses " +
				"and the Gran Maze. The Gran Maze, a giant labyrinth about the size of a football field, is the " +
				"first of its kind in America. Sometimes called the Human Maze, the Gran Maze, offers unique and " +
				"fun challenges. Open year round-spring, summer, fall, and winter.",
				"http://www.coconutcreekfun.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.conservation, o),
				"Conservation Park",
				"850-233-5050",
				"100 Conservation Drive, Panama City Beach, FL",
				"Park",
				"The Conservation Park integrates two fundamental principles which remain a continuing focus for " +
				"local government and community. The desire to protect and balance our natural resources while " +
				"providing outdoor recreational opportunities is the driving force in establishing the Panama City " +
				"Beach Conservation Park.",
				"http://www.pcbgov.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.ebro, o),
				"Ebro Greyhound Park",
				"850-234-3943",
				"6558 Dog Track Rd, Ebro, FL 32437",
				"Dog track",
				"Visit our website for racing schedules. Make sure to check out the Ebro Poker Room, now offering new " +
				"betting and buy-in limits. New games such as Omaha, Omaha Hi-Lo, Omaha Pot Limit, Low Ball, Crazy " +
				"Pineapple, and more. Stakes for structured limit games are offered.",
				"http://www.goebro.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.frankbrown, o),
				"Frank Brown Park",
				"850-233-5045",
				"16200 Panama City Beach Pkwy, Panama City Beach, FL 32413",
				"Park",
				"Over two hundred acres dedicated to outdoor recreation facilities at neighborhood and community parks " +
				"surrounding the beaches. The playgrounds, picnic areas, saltwater fishing pier, freshwater youth " +
				"fishing lake, greenways and trails are open to the public year round and are free from sunrise to sunset.",
				"http://www.playballinparadise.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.gulfworld, o),
				"Gulf World Marine Park",
				"850-234-5271",
				"15412 Front Beach Rd., Panama City Beach, FL 32413",
				"Marine Park",
				"See fascinating shows featuring dolphins, sea lions, tropicla birds and reptiles. Explore exhibits " +
				"showcasing sharks, penguins, alligators, flamingos and much more. Visit the stingray petting pool. Make " +
				"your reservation today for one of our interactive programs that allows you to get up close and personal" + 
				"with the Swim With A Dolphin, or become a Trainer for a Day or attend a Dolphin Day Camp.",
				"http://www.gulfworldmarinepark.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.indy, o),
				"Indy Speedway and Sling Shot",
				"850-234-1121",
				"8762 Thomas Dr, Panama City Beach, FL 32408",
				"Amusement/Entertainment Park",
				"We have Rides to Thrill all ages in our Friendly Clean Fun Park. Our Rides will keep your heart pumping " +
				"almost as fast as our Go-Karts. The Slingshot @ Indy Speedway has been on Thomas Drive for over 9 seasons." +
				"“Get In – Sit Down – Shut Up – and Hang On” The slingshot machine does not utilize rubber ropes or bungee " +
				"cords but is powered by a patented spring propulsion device incorporating up to 720 specially designed " +
				"springs, for a Thrilling 100 Mph flight. We have the Fastest Go-Karts on the beach!",
				"http://www.slingshotpcb.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.stock, o),
				"Miracle Strip at Pier Park",
				"850-230-5200",
				"400 Pier Park Dr., Panama City Beach, FL 32413",
				"Amusement Park",
				"The original Miracle Strip Amusement Park closed for good in 2004. Now, it is being revived although in " +
				"a much smaller venue. We have purchased the remaining rides from MSAP, refurbished them and they are " +
				"now operating in Pier Park on Panama City Beach.",
				"http://www.ms-pp.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.panamadunes, o),
				"Panama Dunes Dune Buggy Adventure Park",
				"850-708-1115",
				"12500 Front Beach Rd, Panana City Beach, FL 32407",
				"Adventure Park",
				"If you are looking for excitement and adventure come and try Panama City Beach’s newest attraction!  " +
				"Panama Dunes is full of thrills that the whole family will enjoy! Starting with our ½ mile, 20-foot " +
				"wide dune buggy track will take you through hairpin turns, 12-foot hills and dips making it hard not " +
				"to leave your seat.  To drive our Can-Am Commanders you must be 16 with a valid driver’s license.  " +
				"To ride along side, passengers must be at least 50 inches tall.",
				"http://www.panamadunesinc.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.aquatic, o),
				"PCB Aquatic Center",
				"850-236-2205",
				"16200 Panama City Beach Parkway, Panama City Beach, FL 32413",
				"Water Park",
				"The Panama City Beach Aquatic Center is located in beautiful Frank Brown Park off Panama City Beach " +
				"Parkway just west of Pier Park. Our state of the art facility features a Heated/Cooled 50 Meter Olympic " +
				"Pool with a one meter springboard diving well and a 5,000 square foot Splash Park. The Panama City Beach " +
				"Aquatic Center has something for everyone. Daily and yearly passes available. The Center also offers a " +
				"wide variety of lessons, exercise classes and certifications.",
				"http://www.swiminparadise.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.rickseltzer, o),
				"Rick Seltzer Park",
				"850-784-4065",
				"7419 Thomas Drive, Panama City Beach, FL 32408",
				"Beach Park",
				"The S. Richard Seltzer Park provides public beach access with adequate parking, preserves a " +
				"representative area of undeveloped beach and provides a site for environmental education. The " +
				"park is 4.75 acres with 850 feet fronting Thomas Drive and a 170 foot gulf front dune system " +
				"preservation with an emphasis on interpretive displays to increase the public’s awareness of " +
				"beach/dune dynamics. The park is open from daylight to dusk. Picnic Areas Pavilion Comfort Areas " +
				"Restrooms Water Fountains Park Benches Water Access Swimming Area ",
				"http://www.co.bay.fl.us/parks.php"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.shipwreckisland, o),
				"Shipwreck Island Waterpark",
				"850-234-3333",
				"12201 Hutchison Blvd, Panama City Beach, FL 32407",
				"Water Park",
				"Shipwreck Island Waterpark is where families get more smiles per gallon on Panama City Beach. " +
				"The wavepool is 500,000 gallons of splashing fun, with four foot tall waves well guarded by our " +
				"professionally trained lifeguard staff. The Tadpole Hole is filled with pint sized attractions for " +
				"little ones to enjoy. The Lazy River is the most relaxing journey at Panama City Beach with sunny " +
				"spots and shaded areas that accent the leisurely ride. Tree Top Drop and The Racing Slide offer " +
				"sixty-five foot falls that can zip you along at 35 miles per hour. ",
				"http://shipwreckisland.com/"));
		
		parks.add(new EntertainmentList(BitmapFactory.decodeResource(getResources(), R.drawable.standrews, o),
				"St. Andrews State Park",
				"850-233-5140",
				"4607 State Park Ln., Panama City Beach, FL 32408",
				"State Park, Beach Park",
				"Well known for its sugar white sands and emerald green waters, this former military reservation has " +
				"over one-and-a-half miles of beaches on the Gulf of Mexico and Grand Lagoon. Water sports enthusiasts " +
				"can enjoy swimming, snorkeling, scuba diving, kayaking, and canoeing. Two fishing piers, a jetty, and a " +
				"boat ramp provide ample fishing opportunities for anglers. Two nature trails wind through a rich " +
				"diversity of coastal plant communities. Those wanting to " +
				"relax can sunbathe on the beach or enjoy a leisurely lunch under the shade of a picnic pavilion.",
				"http://www.floridastateparks.org/standrews/"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/* This method is called when the "Submit" button is clicked.
	   It starts a new Activity based on the user's selection. */
	public void filter(View view) 
	{
		
		switch (spinner.getSelectedItemPosition())
		{
		case 0:
			// parks
			Intent a = new Intent(this, Parks.class);
			startActivity(a);
			break;
		case 1:
			// nightlife
			Intent b = new Intent(this, Nightlife.class);
			startActivity(b);
			break;
		case 2:
			// arts
			Intent c = new Intent(this, Arts.class);
			startActivity(c);
			break;
		default:
			break;
		}
	}

	// Getters
	protected static ArrayList<EntertainmentList> getParks() {
		return parks;
	}

	protected static ArrayList<EntertainmentList> getNightlife() {
		return nightlife;
	}

	protected static ArrayList<EntertainmentList> getArts() {
		return arts;
	}

}
