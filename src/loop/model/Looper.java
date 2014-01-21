package loop.model;
import java.util.ArrayList;
public class Looper
	{
		
		private ArrayList<String> graveNameList;
		
		/**
		 * 
		 * @return
		 */
		public Looper()
			{
				graveNameList = new ArrayList<String>();
				
				fillTheGraveNameList();
			}
		
		public ArrayList<String> getGraveNameList()
		{
			return graveNameList;
		}
		
		private void fillTheGraveNameList()
			{
				graveNameList.add("Averlilda H Jones ");
				graveNameList.add("Elizabeth Ann Gamett Ravenor ");
				graveNameList.add("Hazel Allred Lemmon ");
				graveNameList.add("Hannah Eliza Williams ");
				graveNameList.add("Ferd O Ottosen ");
				graveNameList.add("William Elwin Lemmon ");
				graveNameList.add("Helen Jensen Ottosen Jones ");
				graveNameList.add("John W Clark ");
				graveNameList.add("Arnold E Brady ");
				
			}
		
		public String loopTestOne()
			{
				String loopResult = "";
				int numberOfTimes = 0;
				for (int counter = 5; counter < 20; counter += 2)
					{
						loopResult += counter + ", ";
						numberOfTimes++;
					}
				loopResult += "was the last time";
				loopResult += "\nthe loop exectured " + numberOfTimes + " times.";
				return loopResult;
			}

		public String loopTestTwo()
			{
				String loopResult = "";
				int numberOfTimes = 0;
				for (int mile = 0; mile < 1.15078; mile++)
					{
					for (int yard = 0; yard < 1760; yard++)
						{
							for (int feet = 0; feet < 3; feet++)
								{
									for (int inches = 0; inches < 12; inches++)
										{
											// loopResult += "count is "
											// + count
											// + "\n";
											for (int centimeters = 0; centimeters < 2.54; centimeters++)
												{
													// loopResult +=
													// "otherCount is "
													// +
													// otherCount +
													// "\n";
													numberOfTimes++;
												}
										}
								}
						}
					}
				
				loopResult += "The loop excecuted " + numberOfTimes + "times - wow!";
				return loopResult;

			}

	}
