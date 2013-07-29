/**
 * 
 * ShoppingActivity.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the Shopping Activity.
 * Currently this includes Malls and Specialty Shops.
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

public class ShoppingActivity extends Activity {
	
	private TextView text;
	private Spinner spinner;
	private static ArrayList<ShopList> malls;
	private static ArrayList<ShopList> specialty;
	private static ArrayList<ShopList> allShops;
	BitmapFactory.Options o;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shopping_activity);
		
		text = (TextView)findViewById(R.id.shops);
		spinner = (Spinner)findViewById(R.id.shopSpinner);
		
		// Intro text
		text.setText("Panama City is home to great shopping! Make a selection below to narrow your search, or click submit to see all.");
		
		// set options for Bitmaps
		o = new BitmapFactory.Options();
		o.inPurgeable = true;
		o.inInputShareable = true;
		
		// create ArrayLists
		malls = new ArrayList<ShopList>();
		specialty = new ArrayList<ShopList>();
		allShops = new ArrayList<ShopList>();
		
		// populate the ArrayLists
		populateMalls();
		populateSpecialty();
		populateAll();

	}


	private void populateSpecialty() {
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.alvins, o),
									"Alvin's Island",
									"850-234-2411",
									"14520 Front Beach Rd., Panama City Beach, FL 32413",
									"Specialty",
									"Apparel, Beach Items, Souvenirs",
									"Alvin's Island sells just about anything you could want on your tropical vacation, " +
									"including bathing suits, beach towels, suntan products, beach shoes, resort wear, " +
									"fashion, beach toys, rafts, T-shirts and a large variety of souvenirs to please " +
									"all your friends and family.",
									"http://www.alvinsisland.com"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.seenontv, o),
									"As Seen On TV - White Shores",
									"850-234-3000",
									"701 Pier Park Dr, Panama City Beach, FL 32413",
									"Specialty",
									"As Seen On TV Products",
									"As Seen On TV carries the top hottest as Seen on TV products including Ruggies, " +
									"Hot Buns, Seat Pets, and Music-Bullet.",
									"https://www.asseenontvhot10.com"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.barkingdivas, o),
									"Barking Divas",
									"850-249-9949",
									"7328 Thomas Dr. Suite P, Panama City Beach, FL 32408",
									"Specialty",
									"Pet Apparel and Accessories",
									"Dog Clothes can be found almost everywhere these days, however, Barking Divas offers " +
									"something unique and different in pet apparel and accessories. Barking Divas also " +
									"carries many items especially for you. All Divas have Diva Moms who deserve to be spoiled too.",
									"http://www.barkingdivas.com"));

		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.bigwillys, o),
									"Big Willy's Beach Company",
									"850-235-2661",
									"9703 Front Beach Rd., Panama City Beach, FL 32407",
									"Specialty",
									"Beach Apparel and Accessories",
									"Big Willy's Surf & Swim has everything you need for the beach right on Front Beach Road " +
									"in Panama City Beach, FL! Big Willy's Surf & Swim offers the best selection of swimwear, " +
									"sunglasses, dresses, beach gear, hats, sandals and more in Panama City Beach, Florida!",
									"http://panamacitybeachswimwear.com/Big_Willy_s_Swimwear.php"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.blueheron, o),
									"Blue Heron Fine Gifts",
									"850-588-8008",
									"11260 Panama City Beach Parkway, Panama City Beach, FL 32407",
									"Specialty",
									"Jewelry, Gifts, Decor",
									"Blue Heron Fine Gifts is well known for handmade jewelry, unique gifts, home and coastal " +
									"decor, and some of the most intriguing shopping on Panama City Beach, FL.",
									"http://www.blueheronfinegifts.com"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.cutesassy, o),
									"Cute & Sassy",
									"850-230-5555",
									"7328 Thomas Dr. Suite E, Panama City Beach, FL 32408",
									"Specialty",
									"Children's Clothing",
									"Cute & Sassy carries and elite line of childrens clothes; Play clothes, dressy dresses, " +
									"smock line, swimwear, shore, accessories."));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.floridalinen, o),
									"Florida Linen",
									"850-230-4261",
									"12011 Panama City Beach Pkwy, Panama City Beach, FL 32407",
									"Specialty",
									"Bed, bath, kitchen and dining linens",
									"Florida Linen in Panama City Beach, Florida is the only family owned and operated " +
									"linen store along the Emerald Coast, providing high-quality bed, bath, kitchen and " +
									"dining linens and more!",
									"http://www.floridalinen.net"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.hys, o),
									"Hy's Toggery",
									"850-235-1177",
									"700 Pier Park Dr., Panama City Beach, FL 32413",
									"Specialty",
									"Men's and Women's Apparel",
									"From Columbia to Southern Tide to Tommy Bahama and more, Hy's Toggery has something " +
									"for everyone in the family. From Dad to the grandkids (a new addition for us in 2013), " +
									"shopping has never been easier. Located in Pier Park on the Boardwalk, right next door to Tootsie's. ",
									"http://www.hystoggery.com"));

		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.islanders, o),
									"Islander's Cottage",
									"850-814-7376",
									"9801 Front Beach Road, Panama City Beach, FL 32407",
									"Specialty",
									"Gifts, Jewelry, Art Gallery",
									"Take a little trip to Islanders and find that perfect gift, art and crafts created by the " +
									"locals, a wide array of shells, beachy jewelry & beach supplies.  We also have an Airbrush " +
									"Studio with a great selection of designs, our artists will try to accommodate all of your " +
									"custom needs, but remember great things take time.",
									"https://www.facebook.com/IslandersPCB"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.jakes, o),
									"Jake at the Beach",
									"850-234-6200",
									"800 Pier Park Drive, Panama City Beach, FL 32413",
									"Specialty",
									"Gifts and Apparel",
									"Your Genuine Neighborhood Shoppe selling the largest selection of Coastal inspired " +
									"Life is good® apparel and gifts in the Gulf Coast region.",
									"https://www.facebook.com/jakeatthebeach"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.newbys, o),
									"Newbys Trading Company",
									"850-249-3365",
									"8721 Thomas Drive, Panama City Beach, FL 32408",
									"Specialty",
									"Beach Accessories, Groceries",
									"Forget something for your perfect vacation?  We've got it!  Beach towels, beach toys, " +
									"swim trunks, flip flops, hats, coolers and much more! Plus a large selection of beer, " +
									"wine, and wine coolers.  Fresh hot boiled peanuts, candy, and hand dipped Blue Bell " +
									"Icecream are on hand too!"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.pawsitively, o),
									"Pawsitively Purrfect",
									"850-233-9663",
									"201 S. Arnold Rd., Panama City Beach, FL 32413",
									"Specialty",
									"Pet supplies, apparel, and accessories",
									"Welcome to Pawsitively Purrfect where pampered pets shop for their favorite fashions, " +
									"health and beauty aids and accessories. Our store offers everything from \"frou frou\" " +
									"to functional items for you and  your pet!"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.pieces, o),
									"Pieces",
									"850-234-6277",
									"2505 Thomas Dr., Panama City Beach, FL",
									"Specialty",
									"Home Furniture and Decor",
									"Pieces is a wonderful coastal chic and antique market located on the east end of Panama " +
									"City Beach.  Currently we have several booth vendors who add their own special touches to " +
									"the unique charm the store.  Pieces is an experience that both locals and visitors " +
									"appreciate.  Whether you are looking for coastal chic, antique, or the truly unique, " +
									"Pieces has something for everyone.",
									"http://www.piecesonthebeach.com"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.saltydog, o),
									"Salty Dog",
									"850-230-3430",
									"11930 Front Beach Rd., Panama City Beach, FL 32407",
									"Specialty",
									"Apparel and Accessories",
									"Billabong, Alpine Stars, Volcom, Quicksilver, Fox, Lost, O'neill, Salt Life, Sunglasses & Sandals",
									"http://www.saltydogsurfshop.com/contact"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.shimmeringseas, o),
									"Shimmering Seas Jewelry and Gifts",
									"850-234-6200",
									"820 Pier Park Drive, Panama City Beach, FL 32413",
									"Specialty",
									"Jewelry and Gifts",
									"Featuring Affordable, Elegant Sterling Silver, Gorgeous Pearls, Beautiful Aqua Blue Larimar," +
									" and Cotier Chica. Shimmering Seas is the \"Panhandle\'s Pandora Headquarters\"... " +
									"featuring the Best selection of Pandora Jewelry. Located in PCB at Pier Park\'s " +
									"Boardwalk area near Margaritaville.",
									"https://www.facebook.com/shimmeringseasjewelry"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.shipwreck, o),
									"Shipwreck Ltd.",
									"850-233-6750",
									"10570 Front Beach Rd., Panama City Beach, FL 32407",
									"Specialty",
									"Swimwear, Eyewear, Apparel",
									"Shipwreck is a favorite for locals and tourists alike, with everything from souvenirs " +
									"& beach supplies, to the hottest brands in surf & designer wear. More than just shopping, " +
									"you will find fun for the whole family under our roof as well! Play a few games in our " +
									"arcade, get a temporary henna tattoo or hair wrap, or get your whole group together for " +
									"an Old Time Photo. If you're looking for something to do outdoors, stop by and rent a bike, " +
									"or rent one of our surf, skim or paddle boards for some fun out on the water!",
									"http://www.shipwreckltd.com"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.sunsations, o),
									"Sunsations",
									"850-235-9876",
									"12400 Front Beach Rd., Panama City Beach, FL 32407",
									"Specialty",
									"Apparel, Swimwear, Beach Supplies",
									"Our stores have the best and largest selection of everything that you need for fun " +
									"on the beach! Check out our great assortment of t-shirts, apparel, footwear, swimwear, " +
									"beach chairs, towels, souvenirs, beach toys, surf gear and more for the entire family!",
									"http://www.sunsationsusa.com"));

		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.beachhouse, o),
									"The Beach House Market",
									"850-234-8700",
									"17900 Panama City Beach PKWY, Panama City Beach, FL 32413",
									"Specialty",
									"Home Decor",
									"The Beach House Market is a fun, collective store full of home decor with anything from " +
									"traditional to coastal decorations in every booth. The Beach House's 22 vendors keep " +
									"their booths updated with tons of beautiful and unique finds. Open 7 days a week!",
									"https://www.facebook.com/pages/The-Beach-House-Market/184307644912922"));
		
		specialty.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.sterlingsun, o),
									"The Sterling Sun Jewelry & Gifts",
									"850-588-7065",
									"8730 Thomas Dr #1104 C, Panama City Beach, FL 32408",
									"Specialty",
									"Jewelry and Gifts",
									"The Sterling Sun, jewelry & gifts, is a boutique shop located in beautiful Panama City " +
									"Beach, Florida. We specialize in sterling silver jewelry and gifts and have a large " +
									"selection of earrings, necklaces, charms, pendants, rings and much, much more. ",
									"http://www.thesterlingsunpcb.com"));
		
	}

	private void populateMalls() {
		
		malls.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.pcmall, o),
								"Panama City Mall", 
								"850-785-9587", 
								"2150 Martin Luther King Jr. BLVD, Panama City, FL 32405", 
								"Mall",
								"Shopping Mall",
								"Panama City Mall features over 100 specialty stores, including Victoria’s Secret, GameStop, " +
								"Aeropostale, Sears, and many more. Enjoy shopping and fun for the entire family, with the " +
								"wide variety of shops, department stores, restaurants, and the Carmike Cinema movie theater.",
								"http://www.panamacity-mall.com/shop/panamacity.nsf/index"));
		
		malls.add(new ShopList(BitmapFactory.decodeResource(getResources(), R.drawable.pierpark, o),
								"Pier Park", 
								"850-236-9974",
								"600 Pier Park Dr, Panama City Beach, FL 32413",
								"Mall",
								"Shopping District",
								"Welcome to Pier Park! Among the 124 stores, Pier Park features Target, Forever 21, Dillards, " +
								"JCPenneys and Marshalls. Our outdoor property boasts many dining and entertainment options:  " +
								"An IMAX Theater, restaurants, and live music. Pier Park has stores ranging from jewelry " +
								"to women’s clothing to home décor.",
								"http://www.simon.com/mall/pier-park"));
		
	}
	
	private void populateAll() {
		allShops.addAll(malls);
		allShops.addAll(specialty);
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
			// see all activity
			Intent a = new Intent(this, ShoppingAll.class);
			startActivity(a);
			break;
		case 1:
			// mall activity
			Intent b = new Intent(this, ShoppingMalls.class);
			startActivity(b);
			break;
		case 2:
			// specialty stores activity
			Intent c = new Intent(this, ShoppingSpecialty.class);
			startActivity(c);
			break;
		default:
			break;
		}
	}

	// Getters
	
	protected static ArrayList<ShopList> getMalls() {
		return malls;
	}

	protected static ArrayList<ShopList> getSpecialty() {
		return specialty;
	}

	protected static ArrayList<ShopList> getAllShops() {
		return allShops;
	}
	
}
