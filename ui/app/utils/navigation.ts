export interface LinkData {
    target: string;
    name: string;
    id: string;
}

export interface NavigationPage {
    meta: NavigationPageMeta;
    hasChildren: boolean;
    children?: LinkData[];
    self?: LinkData;
}

export interface NavigationPageMeta {
    id: string;
    name: string;
}

export interface NavigationData {
    pages: NavigationPage[];
}

export const navigationData: NavigationData = {
    pages: [
        {
            meta: { id: 'home', name: 'Home' },
            hasChildren: false,
            self: { target: '/', name: 'Home', id: 'home' }
        },
        {
            meta: { id: 'research', name: 'Research' },
            hasChildren: true,
            children: [
                { target: '/markets', name: 'Markets', id: 'markets' },
                { target: '/commodities', name: 'Commodities', id: 'commodities' },
            ]
        }
    ]
}