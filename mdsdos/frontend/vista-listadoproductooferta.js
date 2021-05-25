import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-listadoproductooferta`
 *
 * VistaListadoproductooferta element.
 *
 * @customElement
 * @polymer
 */
class VistaListadoproductooferta extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-listadoproductooferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoproductooferta.is, VistaListadoproductooferta);
