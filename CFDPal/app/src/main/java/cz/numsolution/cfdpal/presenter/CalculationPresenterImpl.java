package cz.numsolution.cfdpal.presenter;

import cz.numsolution.cfdpal.interactor.CalculationInteractor;
import cz.numsolution.cfdpal.view.CalculationView;

/**
 * Created by Tomas Antecky on 27.3.18.
 */
public final class CalculationPresenterImpl implements CalculationPresenter,
        CalculationInteractor.OnCalculationListener {
    private CalculationView mView;
    private CalculationInteractor mInteractor;

    public CalculationPresenterImpl(CalculationView view, CalculationInteractor interactor) {
        mView = view;
        mInteractor = interactor;
    }

    @Override
    public void onError() {

    }

    @Override
    public void onSuccess() {

    }
}
