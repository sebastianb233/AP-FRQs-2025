public int WalkDogs(int hour){
        //find out from the DogWalkCompanyHow many dogs at hour
        int numDogs = company.newAvalableDogs(hour);
        // if walkercan talk more dogs than available
        if(maxDogs > numDogs){
            company.updateDogs(hour,numDogs);
            return numDogs;
        }
        //if there are more (or equal) dogs than the walker can handle all of than.
        company.updateDogs(hour,maxDogs);
        return maxDogs;
    }
