public int dogWalkShift(int startHour, int endHour){
        int moneyEarned=0;
        for(int hour=startHour;hour <= endHour;hour++){
            int dogs =walkDogs(hour); 
            if(dogs == maxDogs || (hour >=9 && <=17)){
                moneyeEarned +=3;
            }
        }
        return moneyEarned;
    }
