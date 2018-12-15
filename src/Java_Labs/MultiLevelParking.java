package Java_Labs;
import java.util.ArrayList;

public class MultiLevelParking {
    ArrayList<Airport<ITransport>> parkingStages;
    private  int countPlaces = 20;
    public MultiLevelParking(int countStages, int pictureWidth, int pictureHeight)
    {
        parkingStages = new ArrayList<Airport<ITransport>>();
        for(int i =0; i< countStages; ++i)
        {
            parkingStages.add(new Airport<ITransport>(countPlaces, pictureWidth, pictureHeight));
        }
    }


    public Airport<ITransport> getHangar(int ind){
        if((ind>-1) && (ind < parkingStages.size()))
        {
            return parkingStages.get(ind);
        }
        return null;
    }
}