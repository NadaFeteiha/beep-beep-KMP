package presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import presentation.home.HomeScreen
import presentation.notification.NotificationScreen
import presentation.orders.OrderScreen
import presentation.profile.ProfileScreen
import presentation.search.SearchScreen
import resources.Resources

object HomeTab : Tab {

    override val options: TabOptions
        @Composable get() {
            val title = Resources.strings.home
            return remember { TabOptions(index = 0u, title = title) }
        }

    @Composable
    override fun Content() {
        Navigator(screen = HomeScreen())
    }

}

object SearchTab : Tab {

    override val options: TabOptions
        @Composable get() {
            val title = Resources.strings.search
            return remember { TabOptions(index = 1u, title = title) }
        }

    @Composable
    override fun Content() {
        Navigator(screen = SearchScreen())
    }
}

object OrdersTab : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = Resources.strings.orders
            return remember { TabOptions(index = 2u, title = title) }
        }

    @Composable
    override fun Content() {
        Navigator(screen = OrderScreen())
    }
}

object NotificationsTab : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = Resources.strings.notification
            return remember { TabOptions(index = 3u, title = title) }
        }

    @Composable
    override fun Content() {
        Navigator(screen = NotificationScreen())
    }
}

object ProfileTab : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = Resources.strings.profile
            return remember { TabOptions(index = 4u, title = title) }
        }

    @Composable
    override fun Content() {
        Navigator(screen = ProfileScreen())
    }
}

@Composable
fun rememberTabsContainer(): List<TabContainer>{
    val images = Resources.images
    return remember {
        listOf(
            TabContainer(
                HomeTab,
                selectedIcon = images.homeFilled,
                unSelectedIcon = images.homeOutlined
            ), TabContainer(
                SearchTab,
                selectedIcon = images.searchFilled,
                unSelectedIcon = images.searchOutlined
            ), TabContainer(
                OrdersTab,
                selectedIcon = images.ordersFilled,
                unSelectedIcon = images.ordersOutlined
            ), TabContainer(
                NotificationsTab,
                selectedIcon = images.notificationsFilled,
                unSelectedIcon = images.notificationsOutlined
            ), TabContainer(
                ProfileTab,
                selectedIcon = images.profileFilled,
                unSelectedIcon = images.profileOutlined
            )
        )
    }
}

data class TabContainer(
    val tab: Tab,
    val selectedIcon: String,
    val unSelectedIcon: String,
)
