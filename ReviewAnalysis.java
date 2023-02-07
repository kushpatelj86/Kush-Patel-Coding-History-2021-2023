import java.util.ArrayList;

public class ReviewAnalysis 
{
    private Review[] allReviews;

    public ReviewAnalysis()
    {
        allReviews = new Review[5];
    }

    public double getAverageRating()
    {
        double rating = 0;
        for(int i = 0; i < allReviews.length;i++)
        {
            rating += allReviews[i].getRating();
        }
        double average = (double) rating / allReviews.length;
        return average;
    }


    public ArrayList<String> collectComments()
    {
        ArrayList<String> list = new ArrayList<>();


        for(int i = 0; i < allReviews.length; i++)
        {
            for(int k = 0; k < allReviews[i].getComment().length() - 1; k++ )
            {
                if(allReviews[i].getComment().substring(k, k + 1).equals("!"))
                {
                    list.add(allReviews[i].getComment());
                }
            }
        }
        return list;
    }


}
