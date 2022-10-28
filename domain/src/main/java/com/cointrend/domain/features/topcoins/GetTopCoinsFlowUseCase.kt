package com.cointrend.domain.features.topcoins

import com.cointrend.domain.features.commons.automaticrefresh.BaseAutomaticRefreshDataFlowUseCase
import com.cointrend.domain.features.topcoins.models.TopCoinsData
import com.cointrend.domain.features.topcoins.models.TopCoinsRefreshParams
import com.cointrend.domain.models.TOP_COINS_MINUTES_REFRESH_PERIOD
import javax.inject.Inject

/**
 * This UseCase provides the single source of truth of the top coins list.
 * It also automatically handles the refresh of data as a [BaseAutomaticRefreshDataFlowUseCase].
 */
class GetTopCoinsFlowUseCase @Inject constructor(
    topCoinsRepository: TopCoinsRepository,
    refreshTopCoinsUseCase: RefreshTopCoinsUseCase
) : BaseAutomaticRefreshDataFlowUseCase<TopCoinsData, Unit, TopCoinsRefreshParams>(
    refreshDataUseCase = refreshTopCoinsUseCase,
    repository = topCoinsRepository,
    minutesRequiredToRefreshData = TOP_COINS_MINUTES_REFRESH_PERIOD.toLong()
)